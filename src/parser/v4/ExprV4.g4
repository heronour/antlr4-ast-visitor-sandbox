grammar ExprV4;

@header {
package parser.v4;

import ast.*;
import ast.Number;
}

@lexer::header {
package parser.v4;
}

start
  : expr
    EOF
  ;

expr
: '(' e=expr ')'                       -> parenExpr
| left=expr (op='*'|op='/') right=expr -> mulExpr
| left=expr (op='+'|op='-') right=expr -> addExpr
| a=atom                               -> atomExpr
;

atom
   : i=INT
   ;

INT	:	('0'..'9')+
	;

WS  :   (' ' | '\t' | '\r' | '\n')+ {$channel=HIDDEN;}
    ;
