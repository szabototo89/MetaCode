grammar Imperative;

init: (statement)+;
		//|	functionDefinition
		//| macroDefinition)*;

	statement		:		skip
							|		assignment
							|		functionCall
							|		ifStatement
							|		loopStatement
							;

skip					:		'skip'
						  ;

assignment		:		ID ':='	expression
							;

ifStatement		:		'if' '(' expression ')' 'then' statement+ 'endif'
							;

loopStatement	:   'loop' '(' expression ')' 'do' statement+ 'end' 'loop'	
						  ;

functionCall  :		ID '(' actualParameters ')'
						  ;

actualParameters		:		expression (',' expression)*
										;

expression		:		constant	
							|		ID
							|   functionCall
							|		('not' | '-') expression
							|		expression ('+'|'-'|'/'|'*'|'<'|'<='|'>'|'>='|'=='|'!='|'and'|'or') expression
							;

constant			:	  NUMBER | BOOLEAN | STRING
							;

BOOLEAN	:	'false' | 'true'
				;

STRING	:	'"' .*? '"'
				;

NUMBER	:  [0-9]+('.'[0-9]+)*
				;

ID	:	('_'|[a-zA-Z]) ([a-zA-Z0-9]|'_')*
		;

WHITESPACE	:	[ \t]+ -> skip;

NEW_LINE	:	'\r'? '\n' -> skip;