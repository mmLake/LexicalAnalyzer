import java_cup.runtime.*;
import java.util.ArrayList;

%%

%public
%class Lexer
%intwrap
%unicode
%line
%column
%eofclose
%cup


%{
    private Symbol symbol(int type){return new Symbol(type, yyline, yycolumn);}
    private Symbol symbol(int type, Object value){return new Symbol(type, yyline, yycolumn, value);}
%}

/*Alphabet*/
letter = [a-zA-Z]

/*Digits*/
digit = [0-9]

/*Hex Values*/
hex = (0x|0X)[a-fA-F0-9]+

/*IDigit or Hex Value*/
integer = ({digit}+|{hex})

/*Exponents all start with e/E, can have a sign, has at least 1 digit*/
exponent = ((E|e)("+"|"-")?({digit})+)

/*Float*/
double = (({digit}+"."{digit}*{exponent}?)|({digit}+{exponent}))

/*Identifiers must begin with a letter, then has letter,digit,underscore*/
identifier = {letter}({letter}|{digit}|"_")*

/*String*/
string = \"([^\"\n])*\"

/*New line*/
newline = \n

/*Tabs & spaces*/
whitespace = [ \t]+

/*Line Terminator*/
LineTerminator = \r|\n|\r\n

/*Input Character*/
InputCharacter = [^\r\n]

/*Multi line comment*/
MultipleLineComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"

/*Single Line comment*/
OneLineComment     = "//" {InputCharacter}* {LineTerminator}

/*Either multi line or single line comment*/
Comment = ({MultipleLineComment}|{OneLineComment})

%%

/*Ignore comments that match the following*/

{Comment} { }

{string} {System.out.print("stringconstant "); return symbol(sym.STRINGCONSTANT, yytext());}


/*Keywords*/

boolean {System.out.printf("%s ",yytext()); return symbol(sym.BOOLEAN);}
break {System.out.printf("%s ",yytext()); return symbol(sym.BREAK);}
class {System.out.printf("%s ",yytext()); return symbol(sym.CLASS);}
double {System.out.printf("%s ",yytext()); return symbol(sym.DOUBLE);}
else {System.out.printf("%s ",yytext()); return symbol(sym.ELSE);}
extends {System.out.printf("%s ",yytext()); return symbol(sym.EXTENDS);}
for {System.out.printf("%s ",yytext()); return symbol(sym.FOR);}
if {System.out.printf("%s ",yytext()); return symbol(sym.IF);}
implements {System.out.printf("%s ",yytext()); return symbol(sym.IMPLEMENTS);}
int {System.out.printf("%s ",yytext()); return symbol(sym.INT);}
interface {System.out.printf("%s ",yytext()); return symbol(sym.INTERFACE);}
new {System.out.printf("%s ", yytext()); return symbol(sym.NEW);}
newarray {System.out.printf("%s ",yytext()); return symbol(sym.NEWARRAY);}
println {System.out.printf("%s ",yytext()); return symbol(sym.PRINTLN);}
readln {System.out.printf("%s ",yytext()); return symbol(sym.READLN);}
return {System.out.printf("%s ",yytext()); return symbol(sym.RETURN);}
string {System.out.printf("%s ",yytext()); return symbol(sym.STRING);}
void {System.out.printf("%s ",yytext()); return symbol(sym.VOID);}
while {System.out.printf("%s ",yytext()); return symbol(sym.WHILE);}
null {System.out.printf("%s ",yytext()); return symbol(sym.NULL);}

/*due to precedence must place true/false declaration here*/
true|false {System.out.print("boolconstant "); return symbol(sym.BOOLEANCONSTANT);}

{identifier} {System.out.print("id ");  return symbol(sym.ID, yytext());}
{whitespace} { }
{newline} {System.out.print("\n");} /*preserve line breaks*/
{integer} {System.out.print("intconstant "); return symbol(sym.INTCONSTANT, new Integer(yytext()));}
{double} {System.out.print("doubleconstant "); return symbol(sym.DOUBLECONSTANT, new Double(yytext()));}


/*Operators and Punctuation*/

//Arithmetic operations
"+" {System.out.print("plus "); return symbol(sym.PLUS);}
"-" {System.out.print("minus "); return symbol(sym.MINUS);}
"*" {System.out.print("multiplication "); return symbol(sym.MULTIPLICATION);}
"/" {System.out.print("division "); return symbol(sym.DIVISION);}
"%" {System.out.print("mod "); return symbol(sym.MOD);}

//Logical operations
"&&" {System.out.print("and " ); return symbol(sym.AND);}
"||" {System.out.print("or " ); return symbol(sym.OR);}
"!"  {System.out.print("not " ); return symbol(sym.NOT);}
"<" {System.out.print("less "); return symbol(sym.LESS);}
"<=" {System.out.print("lessequal "); return symbol(sym.LESSEQUAL);}
">" {System.out.print("greater "); return symbol(sym.GREATER);}
">=" {System.out.print("greaterequal "); return symbol(sym.GREATEREQUAL);}
"==" {System.out.print("equal "); return symbol(sym.EQUAL);}
"!=" {System.out.print("notequal "); return symbol(sym.NOTEQUAL);}

//Other operations
"=" {System.out.print("assignop "); return symbol(sym.ASSIGNOP);}
";" {System.out.print("semicolon "); return symbol(sym.SEMICOLON);}
"," {System.out.print("comma "); return symbol(sym.COMMA);}
"." {System.out.print("period "); return symbol(sym.PERIOD);}
"(" {System.out.print("leftparen "); return symbol(sym.LEFTPAREN);}
")" {System.out.print("rightparen "); return symbol(sym.RIGHTPAREN);}
"]" {System.out.print("rightbracket "); return symbol(sym.RIGHTBRACKET);}
"[" {System.out.print("leftbracket "); return symbol(sym.LEFTBRACKET);}
"{" {System.out.print("leftbrace "); return symbol(sym.LEFTBRACE);}
"}" {System.out.print("rightbrace "); return symbol(sym.RIGHTBRACE);}

. { /* ignore illegal chars */ }
