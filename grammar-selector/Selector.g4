grammar Selector;


init			: 	'[' selectors ']'
				;

selectors		:	selector (',' selector)*
				;

selector		:	statement
						|	statement operator selector
						;

attribute		:	'[' Property=ID '=' Value=ID ']'
				;

operator		:	'>'
				;

statement 		:	Selector=ID Attributes=attribute*
				;

ID    			:   ('@'? (LETTER|'_') (LETTER|'_'|'-'|[0-9])*) | '*';

fragment
LETTER  		:   [a-zA-Z];

WHITESPACE  	:   [ \t]+ -> skip;

NEWLINE     	:   '\r'? '\n' -> skip
	            ;