grammar ExprV4;

@header {
package de.zeigermann.compilerSandbox.parser.v4;
}

@lexer::header {
package de.zeigermann.compilerSandbox.parser.v4;
}

start
  : e=expr
    EOF
  ;


// # used to be ->
expr
: '(' e=expr ')'                       #ParenExpr
| left=expr (op='*'|op='/') right=expr #OpExpr
| left=expr (op='+'|op='-') right=expr #OpExpr
| i=INT	                               #AtomExpr
;

INT	:	('0'..'9')+
	;

WS  :   [ \t\r\n]+ -> channel(HIDDEN)
    ;
