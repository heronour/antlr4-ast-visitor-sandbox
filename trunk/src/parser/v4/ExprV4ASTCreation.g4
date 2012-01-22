grammar ExprV4ASTCreation;

@header {
package parser.v4;

import ast.*;
import ast.Number;
}

@lexer::header {
package parser.v4;
}

start returns [Expression expr]
  : expr {$expr = $expr.expr;}
    EOF
  ;

expr returns [Expression expr]
: '(' e=expr ')' { $expr = $e.expr; }
| left=expr (op='*'|op='/') right=expr
  { $expr = new Operation($op.text, $left.expr, $right.expr); } 
| left=expr (op='+'|op='-') right=expr
  { $expr = new Operation($op.text, $left.expr, $right.expr); } 
| atom { $expr = $atom.expr; }
;

atom returns [Expression expr]
   : INT { $expr = new Number($INT.text); }
   ;

INT	:	('0'..'9')+
	;

WS  :   (' ' | '\t' | '\r' | '\n')+ -> channel(HIDDEN);
    ;
