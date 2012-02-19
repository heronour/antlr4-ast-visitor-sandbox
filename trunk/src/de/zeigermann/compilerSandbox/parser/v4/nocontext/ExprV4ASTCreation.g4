grammar ExprV4ASTCreation;

@header {
package de.zeigermann.compilerSandbox.parser.v4.nocontext;

import de.zeigermann.compilerSandbox.ast.*;
import de.zeigermann.compilerSandbox.ast.Number;
}

@lexer::header {
package de.zeigermann.compilerSandbox.parser.v4.nocontext;
}

start returns [Expression expression]
  : expr {$expression = $expr.expression;}
    EOF
  ;

expr returns [Expression expression]
: '(' e=expr ')' { $expression = $e.expression; }
| left=expr (op='*'|op='/') right=expr
  { $expression = new Operation($op.text, $left.expression, $right.expression); } 
| left=expr (op='+'|op='-') right=expr
  { $expression = new Operation($op.text, $left.expression, $right.expression); } 
| INT { $expression = new Number($INT.text); }
;

INT	:	('0'..'9')+
	;

WS :   [ \t\r\n]+ -> channel(HIDDEN)
   ;
