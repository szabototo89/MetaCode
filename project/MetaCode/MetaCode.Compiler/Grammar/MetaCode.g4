grammar MetaCode;

init				:	statements
					;

statements			:	Values=statement+
					;

statement			: 	Expression=expression
					|	VariableDeclaration=variableDeclaration
					|	NEWLINE
					;

variableDeclaration	:	Attributes=attributes? VAR VariableName=ID (':' VariableType=typeName)? ASSIGN VariableDefaultValue=expression
					;

expression			:	Attributes=attributes? Constant=constant
					|	Attributes=attributes? Skip=SKIP
					|	Attributes=attributes? Function=functionExpression
					|	Attributes=attributes? Block=blockExpression
					|	Attributes=attributes? If=ifExpression
					|	Attributes=attributes? Foreach=foreachExpression
					|	Attributes=attributes? While=whileExpression
					|	Attributes=attributes? Assignment=assignmentExpression
					|	Attributes=attributes? '(' InnerExpression=expression ')'
					;

functionExpression	:	FUNCTION FunctionName=ID? '(' Parameters=parameterList? ')' (':' ReturnType=typeName)? DO BodyStatements=statements END
					|	FUNCTION FunctionName=ID? '(' Parameters=parameterList? ')' (':' ReturnType=typeName)? '=' BodyExpression=expression
					;

foreachExpression	: 	FOREACH '(' ID IN expression ')' Body=expression
					| 	FOREACH '(' VAR ID ':' ID IN expression ')' Body=expression
					;

whileExpression		: 	WHILE '(' ConditionExpression=expression ')' Body=expression
					;

blockExpression		:	DO Body=statements END
					;

assignmentExpression:	Variable=ID ASSIGN Value=expression (ConditionalAttributes=attributes? IF '(' ConditionalExpression=expression ')')?
					;

ifExpression		:	IF '(' Condition=expression ')' statements 
						ElseIfExpressions=elseIfExpression*
						(ELSE ElseStatements=statements)? 
						END
					;

elseIfExpression	:   ELSE IF '(' expression ')' statements
					;

parameterList		:	parameter (',' parameter)*
					;

parameter 			:	attributes? ID ':' typeName
					;					

typeName			: 	attributes? ID
					;

constant			:	Number=numberConstant
					|	String=stringConstant
					|	Boolean=booleanConstant
					|	Array=arrayConstant
					|	Interval=intervalConstant
					;

numberConstant		:	NUMBER;

stringConstant		:	STRING;

booleanConstant		:	BOOLEAN;

arrayConstant		:	'[' expression (',' expression)* ']'
					|	'[' ']'
					; 

intervalConstant	:	Start=NUMBER '..' End=NUMBER ('by' By=NUMBER)
					;

attributes			:	attribute+
					;

attribute			:	Name=ATTRIBUTE_ID 
					|	Name=ATTRIBUTE_ID '[' constant (',' constant)* ']'
					; 

/*
 * Lexical rules
**/

FUNCTION:	'function';

FOREACH :	'foreach';

WHILE	:	'while';

IF 		: 	'if';

ELSE 	:	'else';

DO  	:	'do';

END 	:	'end';

BOOLEAN	:	'false'
		|	'true'
		;

SKIP  	: 	'skip';

VAR		:	'var';

IN 		: 	'in';

ASSIGN 	:	'=';

ID		:	(LETTER|'_') (LETTER|'_'|[0-9])*
		;

COMMENT :	'//' .*?  NEWLINE -> skip
		;

MULTILINE_COMMENT	: '/*' .*? '*/' -> skip
					;

ATTRIBUTE_ID	: 	'@' (LETTER|'_') (LETTER|'_'|'-'|[0-9])*;

fragment
LETTER	:	[a-zA-Z]
		;

STRING	:	'"' .*? '"'
		;

NUMBER	:	INT
		|	FLOAT
		;

fragment
INT		:	DIGIT+
		;

fragment
FLOAT	:	DIGIT+ '.' DIGIT*
		|	'.' DIGIT+
		;
 
fragment 
DIGIT	:	[0-9]
		;

WHITESPACE	:	[ \t]+ -> skip
			;
NEWLINE		:	'\r'? '\n' -> skip
			;