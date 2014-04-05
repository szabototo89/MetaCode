grammar MetaCode;

init        :   statements
            ;

statements  :   (statement ';')+
            ;

statement   : Expression=expression
            | Return=returnStatement
            | FunctionDeclaration=functionStatement
            | MacroDeclaration=macroStatement
            | VariableDeclaration=variableDeclaration
            | ObjectDeclaration=objectDeclaration
            | AttributeDeclaration=attributeDeclaration
            | If=ifStatement                 
            | Block=blockStatement
            | Foreach=foreachStatement
            | While=whileStatement
            | Skip=skipStatement
            ;

variableDeclaration :   Attributes=attribute* VAR VariableName=ID (':' VariableType=typeName)? (ASSIGN VariableDefaultValue=expression)?
                        ;

attributeDeclaration    :   attribute* 'attribute' AttributeName=ATTRIBUTE_ID ('(' formalParameter (',' formalParameter)* ')')?
                        ;

objectDeclaration   :   attribute* 'object' ObjectName=ID 
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

memberTagExpression :   identifier | functionCallExpression;

primaryExpression   :   Attributes=attribute* Constant=constant
                    |   Attributes=attribute* Id=ID
                    |   Attributes=attribute* Assignment=assignmentExpression
                    |   Attributes=attribute* '(' InnerExpression=expression ')'
                    ;       

functionStatement   :   attribute* FUNCTION FunctionName=ID '(' Parameter=formalParameter (',' Parameter=formalParameter)* ')' (':' ReturnType=typeName)? DO BodyStatements=statements END
                    ;

macroStatement      :   attribute* (Type=IMPLICIT | Type=EXPLICIT) MACRO MacroName=ID '(' Identifier=ID ':' Selector=TREE_SELECTOR ')' DO BodyStatements=statements END
                    ;

foreachStatement    :   attribute* FOREACH '(' Var=VAR? Id=ID (':' VariableType=typeName)? IN ArrayExpression=expression ')' Body=statement
                    ;

whileStatement      :   attribute* WHILE '(' ConditionExpression=expression ')' Body=statement
                    ;

blockStatement      :   attribute* DO Body=statements END
                    ;

skipStatement       :   SKIP;

returnStatement     :   RETURN ReturnExpression=expression;

assignmentExpression:   LeftValue=memberExpression ASSIGN RightValue=expression (ConditionalAttributes=attribute* IF '(' ConditionalExpression=expression ')')?
                    |   VariableName=ID ASSIGN RightValue=expression (ConditionalAttributes=attribute* IF '(' ConditionalExpression=expression ')')?
                    ;

ifStatement     :   attribute* IF '(' Condition=expression ')' Statements=statements 
                    ElseIfStatements=elseIfStatement*
                    (ELSE ElseStatements=statements)? 
                    END
                ;

elseIfStatement :   ELSE IF '(' Condition=expression ')' Statements=statements
                ;

formalParameter     :   Attributes=attribute* Name=ID ':' Type=typeName
                    ;                   

actualParameterList :   expression (',' expression)*
                    ;

typeName            :   attribute* ID ('.' ID)*
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

attribute   :   Name=ATTRIBUTE_ID ('(' expression (',' expression)* ')')?
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