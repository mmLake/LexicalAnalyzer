//package cpp.cs.cs420.IsolationGame;
import java.io.*;

public class Main {
    public static void main(String...z) {
        try {
            Lexer lex = new Lexer(new FileReader(z[0]));
//            while(lex.yylex() != null) {}
//            System.out.println("\n\n");
//            System.out.println("Trie Table for identifiers:\n");
//            lex.printTable();
//            System.out.println("\n\n");
            parser p = new parser (lex);
            p.parse();
        }
        catch (Exception e) {
            System.out.println("Usage: java LexerTest <Input File Name>");
        }
    }

}