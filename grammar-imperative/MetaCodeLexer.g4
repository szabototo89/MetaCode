lexer grammar MetaCodeLexer;

WHITESPACE	:	[ \t]+ -> skip
			;
NEWLINE		:	[\r]? [\n] -> skip
			;

NUMBER	:	INT
		|	FLOAT
		;

fragment
INT		:	DIGIT+
		;

fragment
FLOAT	:	DIGIT+ [.] DIGIT*
		|	[.] DIGIT+
		;
 
fragment 
DIGIT	:	[0-9]
		;