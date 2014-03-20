grammar MetaCode;

init        :   statements
            ;

statements  :   (statement ';')+
            ;

statement   : Expression=expression
            | Attributes=attributes? VariableDeclaration=variableDeclaration
            | Attributes=attributes? If=ifStatement                 
            | Attributes=attributes? Block=blockStatement
            | Attributes=attributes? Foreach=foreachStatement
            | Attributes=attributes? While=whileStatement
            | Attributes=attributes? Skip=skipStatement
            ;

variableDeclaration :   Attributes=attributes? VAR VariableName=ID (':' VariableType=typeName)? ASSIGN VariableDefaultValue=expression
                        ;

expression  : primaryExpression
            | functionCallExpression 
            | memberExpression
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

binaryExpression	:

functionCallExpression  :   primaryExpression '(' expression? ')'   
                        ;

memberExpression    : primaryExpression ('.' (ID | functionCallExpression))+
                    ;         

primaryExpression   :   Attributes=attributes? Constant=constant
                    |   Attributes=attributes? Id=ID
                    |   Attributes=attributes? Function=functionExpression
                    |   Attributes=attributes? Assignment=assignmentExpression
                    |   Attributes=attributes? '(' InnerExpression=expression ')'
                    ;       

functionExpression  :   FUNCTION FunctionName=ID? '(' Parameters=formalParameterList? ')' (':' ReturnType=typeName)? DO BodyStatements=statements END
                    |   FUNCTION FunctionName=ID? '(' Parameters=formalParameterList? ')' (':' ReturnType=typeName)? '=' BodyExpression=expression
                    ;

foreachStatement    :   FOREACH '(' Id=ID IN ArrayExpression=expression ')' Body=statement
                    |   FOREACH '(' VAR VarId=ID ':' TypeName=typeName IN ArrayExpression=expression ')' Body=statement
                    ;

whileStatement      :   WHILE '(' ConditionExpression=expression ')' Body=statement
                    ;

blockStatement      :   DO Body=statements END
                    ;

skipStatement				: 	SKIP
										;

assignmentExpression:   Variable=ID ASSIGN Value=expression (ConditionalAttributes=attributes? IF '(' ConditionalExpression=expression ')')?
                    ;

ifStatement     :   IF '(' Condition=expression ')' Statements=statements 
                    ElseIfExpressions=elseIfStatement*
                    (ELSE ElseStatements=statements)? 
                    END
                    ;

elseIfStatement :   ELSE IF '(' expression ')' statements
                ;

formalParameterList :   formalParameter (',' formalParameter)*
                    ;

formalParameter     :   attributes? ID ':' typeName
                    ;                   

actualParameterList :   expression (',' expression)*
                    ;

typeName            :   attributes? ID
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

AND			:		'and';

OR 			: 	'or';

NOT			: 	'not';

NEW 		:		'new';

NULL		:	'null';

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