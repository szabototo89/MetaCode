grammar TreeSelector;


init			: 	'{' selectors '}'
				;

selectors		:	selector (',' selector)*
				;

selector		:	Parent=statement (Operator=OPERATOR? Child=selector)?
				;

attribute		:	'[' Property=ID ('=' Value=ID)? ']'
				;

OPERATOR		:	'>'
				|	'+'
				;

statement 		:	Selector=ID Attributes=attribute*
				;

ID    			:   ('@'? (LETTER|'_') (LETTER|'_'|'-'|[0-9])*) | '*';

fragment
LETTER  		:   [a-zA-Z];

WHITESPACE  	:   [ \t]+ -> skip;

NEWLINE     	:   '\r'? '\n' -> skip
	            ;