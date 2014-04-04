grammar MetaCode;

init        :   statements
            ;

statements  :   (statement ';')+
            ;

statement   : Expression=expression
			| Return=returnStatement
            | Attributes=attributes? FunctionDeclaration=functionStatement
            | Attributes=attributes? MacroDeclaration=macroStatement
            | Attributes=attributes? VariableDeclaration=variableDeclaration
			| Attributes=attributes? ObjectDeclaration=objectDeclaration
			| Attributes=attributes? AttributeDeclaration=attributeDeclaration
            | Attributes=attributes? If=ifStatement                 
            | Attributes=attributes? Block=blockStatement
            | Attributes=attributes? Foreach=foreachStatement
            | Attributes=attributes? While=whileStatement
            | Attributes=attributes? Skip=skipStatement
            ;

variableDeclaration :   Attributes=attributes? VAR VariableName=ID (':' VariableType=typeName)? ASSIGN VariableDefaultValue=expression
                        ;

attributeDeclaration	:	'attribute' ID ('(' formalParameter (',' formalParameter)* ')')?
						;

objectDeclaration	:	'object' ID 
							(formalParameter ';')+
						END
					;

expression  : PrimaryExpression=primaryExpression
            | FunctionCallExpression=functionCallExpression 
            | MacroCallExpression=macroCallExpression 
            | MemberExpression=memberExpression 
            | Operator=NOT Expression=expression
            | Left=expression Operator='+' Right=expression
            | Left=expression Operator='-' Right=expression                          
            | Left=expression Operator='*' Right=expression                          
            | Left=expression Operator='/' Right=expression                          
            | Left=expression Operator='<' Right=expression                          
            | Left=expression Operator='>' Right=expression                          
            | Left=expression Operator='<=' Right=expression                          
            | Left=expression Operator='>=' Right=expression                          
            | Left=expression Operator='==' Right=expression                          
            | Left=expression Operator='!=' Right=expression                          
            | Left=expression Operator=AND Right=expression                          
            | Left=expression Operator=OR Right=expression                          
            ;

functionCallExpression  :   primaryExpression '(' expression? ')';

macroCallExpression  :   MACRO ID '(' statement ')'
                     ;

memberExpression    : ID ('.' ID)+
                    ;

/*
memberExpression    : (primaryExpression | functionCallExpression) ('.' memberTagExpression)+;         
*/

memberTagExpression	:	identifier | functionCallExpression;

primaryExpression   :   Attributes=attributes? Constant=constant
                    |   Attributes=attributes? Id=ID
                    |   Attributes=attributes? Assignment=assignmentExpression
                    |   Attributes=attributes? '(' InnerExpression=expression ')'
                    ;       

functionStatement   :   FUNCTION FunctionName=ID '(' Parameter=formalParameter (',' Parameter=formalParameter)* ')' (':' ReturnType=typeName)? DO BodyStatements=statements END
                    ;

macroStatement      :   (Type=IMPLICIT | Type=EXPLICIT) MACRO MacroName=ID '(' Identifier=ID ':' Selector=TREE_SELECTOR ')' DO BodyStatements=statements END
                    ;

foreachStatement    :   FOREACH '(' Var=VAR? Id=ID (':' VariableType=typeName)? IN ArrayExpression=expression ')' Body=statement
                    ;

whileStatement      :   WHILE '(' ConditionExpression=expression ')' Body=statement
                    ;

blockStatement      :   DO Body=statements END
                    ;

skipStatement       :   SKIP;

returnStatement		:	RETURN ReturnExpression=expression;

assignmentExpression:   Variable=ID ASSIGN Value=expression (ConditionalAttributes=attributes? IF '(' ConditionalExpression=expression ')')?
                    ;

ifStatement     :   IF '(' Condition=expression ')' Statements=statements 
                    ElseIfStatements=elseIfStatement*
                    (ELSE ElseStatements=statements)? 
                    END
                ;

elseIfStatement :   ELSE IF '(' Condition=expression ')' Statements=statements
                ;

formalParameter     :   Attributes=attributes? Name=ID ':' Type=typeName
                    ;                   

actualParameterList :   expression (',' expression)*
                    ;

typeName            :   attributes? ID ('.' ID)*
                    ;

constant            :   Number=numberConstant
                    |   String=stringConstant
                    |   Boolean=booleanConstant
                    |   Array=arrayConstant
                    |   Interval=intervalConstant
                    |   Null=NULL
                    |   TreeSelector=TREE_SELECTOR
                    ;

identifier          :   Id=ID
                    ;

numberConstant      :   NUMBER;

stringConstant      :   STRING;

booleanConstant     :   BOOLEAN;

arrayConstant       :   '[' expression (',' expression)* ']'
                    |   '[' ']'
                    ; 

intervalConstant    :   Start=NUMBER 'to' End=NUMBER ('by' By=NUMBER)?
                    ;

attributes  :   attribute+
            ;

attribute   :   Name=ATTRIBUTE_ID ('(' constant (',' constant)* ')')?
            ; 

/*
 * Lexical rules
**/


FUNCTION:   'function';

FOREACH :   'foreach';

WHILE   :   'while';

IF      :   'if';

ELSE    :   'else';

DO      :   'do';

END     :   'end';

BOOLEAN :   'false'
        |   'true'
        ;

IMPLICIT    :   'implicit'
            ;

EXPLICIT    :   'explicit'
            ;

MACRO       :   'macro'
            ;

SKIP    :   'skip'
        ;

VAR     :   'var'
        ;

IN      :   'in'    
        ;

ASSIGN  :   '='
        ;

AND         :       'and';

OR          :   'or';

NOT         :   'not';

NULL        :   'null';

RETURN      :   'return';

LEFT_PARENTHESIS  : '(';

RIGHT_PARENTHESIS : ')';

ID      :   (LETTER|'_') (LETTER|'_'|[0-9])*
        ;

COMMENT :   '//' .*?  NEWLINE -> skip
        ;

MULTILINE_COMMENT   : '/*' .*? '*/' -> skip
                    ;

TREE_SELECTOR   :   '{' .+? '}'
                ;

ATTRIBUTE_ID    :   '@' (LETTER|'_') (LETTER|'_'|'-'|[0-9])*;

fragment
LETTER  :   [a-zA-Z]
        ;

STRING  :   '"' .*? '"'
        ;

NUMBER  :   INT
        |   FLOAT
        ;

fragment
INT     :   DIGIT+
        ;

fragment
FLOAT   :   DIGIT+ '.' DIGIT*
        |   '.' DIGIT+
        ;
 
fragment 
DIGIT   :   [0-9]
        ;

WHITESPACE  :   [ \t]+ -> skip
            ;

NEWLINE     :   '\r'? '\n' -> skip
            ;