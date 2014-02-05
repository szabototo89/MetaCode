grammar MetaCode;

init				:	statements
					;

statements			:	(statement)+
					;

statement			: 	expression
					|	variableDeclaration
					|	NEWLINE
					;

variableDeclaration	:	ID* VAR ID (':' ID)? ASSIGN expression
					;

expression			:	constant
					|	ifExpression
					|	assignExpression
					|	'(' expression ')'
					;

assignExpression	:	(ID)* ID ASSIGN expression (IF '(' expression ')')?
					;

ifExpression		:	IF '(' expression ')' statements 
						(ELSE IF '(' expression ')' statements)*
						(ELSE statements)? 
						END
					;

constant			:	NUMBER
					|	STRING
					|	BOOLEAN
					;

/*
 * Lexical rules
**/

IF 		: 	'if';

ELSE 	:	'else';

END 	:	'end';

BOOLEAN	:	'false'
		|	'true'
		;

VAR		:	'var';

ASSIGN 	:	'=';

ID		:	(LETTER|'_') (LETTER|'_'|'-'|[0-9])*
		;

ATTRIBUTE_ID	:	(LETTER|'_') (LETTER|'_'|'-'|[0-9])*;

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