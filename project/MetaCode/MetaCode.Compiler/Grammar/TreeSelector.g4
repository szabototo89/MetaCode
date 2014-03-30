grammar TreeSelector;


init			: 	'[' selectors ']'
				;

selectors		:	selector (',' selector)*
				;

selector		:	statement
				|	selector operator selector
				;

attribute		:	'[' ID '=' ID ']'
				;

operator		:	'>'
				|	'+'
				;

statement 		:	baseStatement attribute*
				;

baseStatement   :	Statement=WHILE
				|	Statement=FOREACH
				|	Statement=FUNCTION
				|	Statement=IF
				|	Statement=TRUE_STATEMENT
				|	Statement=ELSE_STATEMENT
				|	Statement=BODY
				|	Statement=EXPRESSION
				|	Statement=VARIABLE
				|	Statement=ALL
				;


WHILE 			:	'while';
FOREACH 		:	'foreach';
FUNCTION		:	'function';
IF 				:	'if';
TRUE_STATEMENT	:	'else-if';
ELSE_STATEMENT	:	'else';
BODY			:	'body';
EXPRESSION		:	'expression';
VARIABLE		:	'variable';
DECLARATION		:	'declaration';
ALL				:	'*';

ID    			:   '@'? (LETTER|'_') (LETTER|'_'|'-'|[0-9])*;

fragment
LETTER  		:   [a-zA-Z];

WHITESPACE  	:   [ \t]+ -> skip;

NEWLINE     	:   '\r'? '\n' -> skip
	            ;