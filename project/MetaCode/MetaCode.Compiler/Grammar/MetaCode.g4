grammar MetaCode;

init        :   statements
            ;

statements  :   (statement ';')+
            ;

statement   : Expression=expression
			| Return=returnStatement
            | Attributes=attributes? VariableDeclaration=variableDeclaration
            | Attributes=attributes? If=ifStatement                 
            | Attributes=attributes? Block=blockStatement
            | Attributes=attributes? Foreach=foreachStatement
            | Attributes=attributes? While=whileStatement
            | Attributes=attributes? Skip=skipStatement
            ;

variableDeclaration :   Attributes=attributes? VAR VariableName=ID (':' VariableType=typeName)? ASSIGN VariableDefaultValue=expression
                        ;

expression  : PrimaryExpression=primaryExpression
            | FunctionCallExpression=functionCallExpression 
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

functionCallExpression  :   (ID | functionExpression) '(' expression? ')'   
                        ;

memberExpression    : (primaryExpression | functionCallExpression) ('.' memberTagExpression)+
                    ;         

memberTagExpression	:	ID | functionCallExpression;

primaryExpression   :   Attributes=attributes? Constant=constant
                    |   Attributes=attributes? Id=ID
                    |   Attributes=attributes? Function=functionExpression
                    |   Attributes=attributes? Assignment=assignmentExpression
                    |   Attributes=attributes? '(' InnerExpression=expression ')'
                    ;       

functionExpression  :   FUNCTION FunctionName=ID? '(' Parameters=formalParameterList? ')' (':' ReturnType=typeName) DO BodyStatements=statements END
                    |   FUNCTION FunctionName=ID? '(' Parameters=formalParameterList? ')' (':' ReturnType=typeName) '=' BodyExpression=expression
                    ;

foreachStatement    :   FOREACH '(' Var=VAR? Id=ID (':' VariableType=typeName)? IN ArrayExpression=expression ')' Body=statement
                    ;

whileStatement      :   WHILE '(' ConditionExpression=expression ')' Body=statement
                    ;

blockStatement      :   DO Body=statements END
                    ;

skipStatement       :   SKIP;

returnStatement		:	RETURN expression;

assignmentExpression:   Variable=ID ASSIGN Value=expression (ConditionalAttributes=attributes? IF '(' ConditionalExpression=expression ')')?
                    ;

ifStatement     :   IF '(' Condition=expression ')' Statements=statements 
                    ElseIfStatements=elseIfStatement*
                    (ELSE ElseStatements=statements)? 
                    END
                ;

elseIfStatement :   ELSE IF '(' Condition=expression ')' Statements=statements
                ;

formalParameterList :   formalParameter (',' formalParameter)*
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

SKIP    :   'skip';

VAR     :   'var';

IN      :   'in';

ASSIGN  :   '=';

AND         :       'and';

OR          :   'or';

NOT         :   'not';

NULL        :   'null';

RETURN		:	'return';

LEFT_PARENTHESIS  : '(';

RIGHT_PARENTHESIS : ')';

ID      :   (LETTER|'_') (LETTER|'_'|[0-9])*
        ;

COMMENT :   '//' .*?  NEWLINE -> skip
        ;

MULTILINE_COMMENT   : '/*' .*? '*/' -> skip
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