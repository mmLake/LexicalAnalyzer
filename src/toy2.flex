import java_cup.runtime.*;


%%
%unicode
%class Lexer
%line
%column
%cup


%{
    /*********************************************************************************/
    /* Create a new java_cup.runtime.Symbol with information about the current token */
    /*********************************************************************************/
    private Symbol symbol(int type){return new Symbol(type, yyline, yycolumn);}
    private Symbol symbol(int type, Object value){return new Symbol(type, yyline, yycolumn, value);}

%}

WhiteSpace = [ \t\f\r\n]
Number = [0-9]+

%%

";" {return symbol(sym.SEMI);}
"+" {return symbol(sym.PLUS);}
"-" {return symbol(sym.MINUS);}
"*" {return symbol(sym.TIMES);}
"/" {return symbol(sym.DIVIDE);}
"%" {return symbol(sym.MOD);}
"(" {return symbol(sym.LPAREN);}
")" {return symbol(sym.RPAREN);}

{Number} {return symbol(sym.NUMBER, new Integer(yytext()) );}
{WhiteSpace} { /* ignore */ }
. {}

<<EOF>>{return symbol(sym.EOF);}