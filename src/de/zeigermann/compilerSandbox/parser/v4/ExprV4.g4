grammar ExprV4;

@header {
package de.zeigermann.compilerSandbox.parser.v4;
}

@lexer::header {
package de.zeigermann.compilerSandbox.parser.v4;
}

start
  : expr
    EOF
  ;

expr
: '(' e=expr ')'                       -> parenExpr
| left=expr (op='*'|op='/') right=expr -> opExpr
| left=expr (op='+'|op='-') right=expr -> opExpr
| i=INT	                               -> atomExpr
;

INT	:	('0'..'9')+
	;

WS  :   [ \t\r\n]+ -> channel(HIDDEN)
    ;
