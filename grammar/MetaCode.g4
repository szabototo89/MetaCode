grammar MetaCode;

init				:	statements
					;

statements			:	(statement)+
					;

statement			: 	expression
					|	variableDeclaration
					|	NEWLINE
					;

variableDeclaration	:	VAR ID (':' ID)? ASSIGN expression
					;

expression			:	attributes? constant
					|	attributes? SKIP
					|	attributes? blockExpression
					|	attributes? ifExpression
					|	attributes? assignExpression
					|	attributes? '(' expression ')'
					;

blockExpression		:	DO statements END
					;

assignExpression	:	ID ASSIGN expression (attributes? IF '(' expression ')')?
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

attributes			:	ID+
					;

/*
 * Lexical rules
**/

IF 		: 	'if';

ELSE 	:	'else';

DO  	:	'do';

END 	:	'end';

BOOLEAN	:	'false'
		|	'true'
		;

SKIP  	: 	'skip';

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