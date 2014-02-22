grammar MetaCode;

init				:	statements
					;

statements			:	(statement)+
					;

statement			: 	expression
					|	variableDeclaration
					|	NEWLINE
					;

variableDeclaration	:	attributes? VAR ID (':' typeName)? ASSIGN expression
					;

expression			:	attributes? constant
					|	attributes? SKIP
					|	attributes? functionExpression
					|	attributes? blockExpression
					|	attributes? ifExpression
					|	attributes? foreachExpression
					|	attributes? whileExpression
					|	attributes? assignmentExpression
					|	attributes? '(' expression ')'
					;

functionExpression	:	FUNCTION ID? '(' parameterList? ')' (':' typeName)? DO statements END
					|	FUNCTION ID? '(' parameterList? ')' (':' typeName)? '=' expression
					;

foreachExpression	: 	FOREACH '(' ID IN expression ')' expression
					| 	FOREACH '(' VAR ID ':' ID IN expression ')' expression
					;

whileExpression		: 	WHILE '(' expression ')' expression
					;

blockExpression		:	DO statements END
					;

assignmentExpression:	ID ASSIGN expression (attributes? IF '(' expression ')')?
					;

ifExpression		:	IF '(' expression ')' statements 
						(ELSE IF '(' expression ')' statements)*
						(ELSE statements)? 
						END
					;

parameterList		:	parameter (',' parameter)*
					;

parameter 			:	attributes? ID ':' typeName
					;					

typeName			: 	attributes? ID
					;

constant			:	NUMBER
					|	STRING
					|	BOOLEAN
					|	array
					;

array				:	'[' expression (',' expression)* ']'
					|	'[' ']'
					;

attributes			:	attribute+
					;

attribute			:	ATTRIBUTE_ID 
					|	ATTRIBUTE_ID '[' constant (',' constant)* ']'
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