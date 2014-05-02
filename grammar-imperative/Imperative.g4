grammar Imperative;

init: sequence
		|	functionDefinition
		| procedureDefinition
		;
		//| macroDefinition;

functionDefinition	:  'function' ID '(' formalParameters? ')' 'returns' ID 'begin'
													sequence
											 'endfunction'
										;

procedureDefinition	:		'procedure' ID '(' formalParameters? ')' 'begin'
													sequence
												'endfunction'
										;

formalParameters		:		(ID ':' ID) (',' (ID ':' ID))*
										;

statement		:		skip
						|		assignment
						|		returnStatement
						|		functionCall
						|		ifStatement
						|		loopStatement
						;

returnStatement	: 'return' expression;

sequence			:		statement+;

skip					:		'skip'
						  ;

assignment		:		ID ':='	expression
							;

ifStatement		:		'if' '(' expression ')' 'then' sequence 'endif'
							;

loopStatement	:   'loop' '(' expression ')' 'do' sequence 'endloop'	
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