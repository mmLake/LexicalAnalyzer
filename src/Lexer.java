/* The following code was generated by JFlex 1.7.0 */
//package cpp.cs.cs420.IsolationGame;

import java_cup.runtime.*;
import java.util.ArrayList;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>/Users/mayalake/IdealProjects/LexicalAnalyzer/src/cpp/cs/cs420/IsolationGame/toy.flex</tt>
 */
public class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\17\1\16\1\67\1\67\1\20\22\0\1\17\1\53\1\15"+
    "\2\0\1\50\1\51\1\0\1\61\1\62\1\22\1\11\1\60\1\12"+
    "\1\13\1\21\1\3\11\2\1\0\1\57\1\54\1\55\1\56\2\0"+
    "\4\6\1\7\1\6\21\1\1\5\2\1\1\64\1\0\1\63\1\0"+
    "\1\14\1\0\1\26\1\23\1\32\1\34\1\10\1\37\1\45\1\47"+
    "\1\40\1\1\1\31\1\25\1\41\1\27\1\24\1\42\1\1\1\30"+
    "\1\33\1\36\1\35\1\46\1\43\1\4\1\44\1\1\1\65\1\52"+
    "\1\66\7\0\1\67\u1fa2\0\1\67\1\67\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\3\1\2\1\4\1\5\1\6"+
    "\1\1\1\7\1\10\1\11\1\12\14\2\1\13\2\1"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\0\1\30\1\0\2\2"+
    "\1\0\1\31\2\0\14\2\1\32\4\2\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\1\30\1\0\1\3\2\2"+
    "\2\10\2\0\2\2\1\41\7\2\1\42\1\2\1\43"+
    "\5\2\1\44\1\0\3\2\1\45\5\2\1\46\4\2"+
    "\1\47\2\2\1\50\3\2\1\51\5\2\1\52\3\2"+
    "\1\53\1\54\1\55\1\56\3\2\1\57\1\60\3\2"+
    "\1\61\1\62\2\2\1\63\1\2\1\64";

  private static int [] zzUnpackAction() {
    int [] result = new int[152];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\70\0\160\0\250\0\340\0\u0118\0\70\0\70"+
    "\0\70\0\u0150\0\70\0\u0188\0\u01c0\0\70\0\u01f8\0\u0230"+
    "\0\u0268\0\u02a0\0\u02d8\0\u0310\0\u0348\0\u0380\0\u03b8\0\u03f0"+
    "\0\u0428\0\u0460\0\70\0\u0498\0\u04d0\0\u0508\0\u0540\0\u0578"+
    "\0\u05b0\0\70\0\70\0\70\0\70\0\70\0\70\0\70"+
    "\0\70\0\u05e8\0\u0620\0\u0658\0\u0690\0\u06c8\0\u0150\0\70"+
    "\0\u0700\0\u0738\0\u0770\0\u07a8\0\u07e0\0\u0818\0\u0850\0\u0888"+
    "\0\u08c0\0\u08f8\0\u0930\0\u0968\0\u09a0\0\u09d8\0\160\0\u0a10"+
    "\0\u0a48\0\u0a80\0\u0ab8\0\70\0\70\0\70\0\70\0\70"+
    "\0\70\0\u0af0\0\u0af0\0\u0658\0\u0b28\0\u0b60\0\70\0\u0b98"+
    "\0\u0bd0\0\u0c08\0\u0c40\0\u0c78\0\u0cb0\0\u0ce8\0\u0d20\0\u0d58"+
    "\0\u0d90\0\u0dc8\0\u0e00\0\u0e38\0\160\0\u0e70\0\u0ea8\0\u0ee0"+
    "\0\u0f18\0\u0f50\0\u0f88\0\u0fc0\0\160\0\u0ff8\0\u1030\0\u1068"+
    "\0\u10a0\0\160\0\u10d8\0\u1110\0\u1148\0\u1180\0\u11b8\0\160"+
    "\0\u11f0\0\u1228\0\u1260\0\u1298\0\160\0\u12d0\0\u1308\0\160"+
    "\0\u1340\0\u1378\0\u13b0\0\160\0\u13e8\0\u1420\0\u1458\0\u1490"+
    "\0\u14c8\0\160\0\u1500\0\u1538\0\u1570\0\160\0\160\0\160"+
    "\0\160\0\u15a8\0\u15e0\0\u1618\0\160\0\160\0\u1650\0\u1688"+
    "\0\u16c0\0\160\0\160\0\u16f8\0\u1730\0\160\0\u1768\0\160";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[152];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\4\3\1\6\1\7\1\10"+
    "\1\11\1\2\1\12\1\13\1\14\1\0\1\15\1\16"+
    "\1\17\3\3\1\20\1\21\1\3\1\22\1\23\1\24"+
    "\1\3\1\25\1\26\1\27\1\3\1\30\1\31\2\3"+
    "\1\32\1\3\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50"+
    "\1\51\72\0\10\3\3\0\1\3\6\0\25\3\22\0"+
    "\2\4\3\0\2\52\2\0\1\53\56\0\2\4\2\54"+
    "\1\0\2\52\2\0\1\53\55\0\3\3\1\55\4\3"+
    "\3\0\1\3\6\0\2\3\1\56\22\3\20\0\15\57"+
    "\1\60\1\0\51\57\17\0\1\14\71\0\1\61\1\62"+
    "\46\0\10\3\3\0\1\3\6\0\1\3\1\63\3\3"+
    "\1\64\17\3\21\0\7\3\1\65\3\0\1\3\6\0"+
    "\12\3\1\66\12\3\21\0\7\3\1\67\3\0\1\3"+
    "\6\0\25\3\21\0\10\3\3\0\1\3\6\0\2\3"+
    "\1\70\22\3\21\0\10\3\3\0\1\3\6\0\13\3"+
    "\1\71\11\3\21\0\10\3\3\0\1\3\6\0\1\3"+
    "\1\72\23\3\21\0\10\3\3\0\1\3\6\0\5\3"+
    "\1\73\17\3\21\0\10\3\3\0\1\3\6\0\1\3"+
    "\1\74\1\3\1\75\21\3\21\0\10\3\3\0\1\3"+
    "\6\0\4\3\1\76\7\3\1\77\1\3\1\100\6\3"+
    "\21\0\10\3\3\0\1\3\6\0\5\3\1\101\17\3"+
    "\21\0\10\3\3\0\1\3\6\0\24\3\1\102\21\0"+
    "\10\3\3\0\1\3\6\0\1\3\1\103\23\3\71\0"+
    "\1\104\70\0\1\105\72\0\1\106\67\0\1\107\67\0"+
    "\1\110\67\0\1\111\14\0\2\112\5\0\2\113\57\0"+
    "\2\53\3\0\2\52\61\0\2\114\2\0\3\114\12\0"+
    "\1\114\2\0\1\114\3\0\1\114\1\0\1\114\2\0"+
    "\1\114\31\0\10\3\3\0\1\3\6\0\13\3\1\115"+
    "\11\3\21\0\10\3\3\0\1\3\6\0\10\3\1\116"+
    "\14\3\20\0\16\61\1\117\1\61\1\120\47\61\22\121"+
    "\1\122\45\121\1\0\10\3\3\0\1\3\6\0\1\3"+
    "\1\123\23\3\21\0\7\3\1\124\3\0\1\3\6\0"+
    "\25\3\21\0\10\3\3\0\1\3\6\0\20\3\1\125"+
    "\4\3\21\0\10\3\3\0\1\3\6\0\2\3\1\126"+
    "\22\3\21\0\10\3\3\0\1\3\6\0\3\3\1\127"+
    "\7\3\1\130\11\3\21\0\10\3\3\0\1\3\6\0"+
    "\3\3\1\131\21\3\21\0\10\3\3\0\1\3\6\0"+
    "\5\3\1\132\17\3\21\0\10\3\3\0\1\3\6\0"+
    "\12\3\1\133\12\3\21\0\10\3\3\0\1\3\6\0"+
    "\12\3\1\134\12\3\21\0\10\3\3\0\1\3\6\0"+
    "\5\3\1\135\17\3\21\0\10\3\3\0\1\3\6\0"+
    "\2\3\1\136\22\3\21\0\10\3\3\0\1\3\6\0"+
    "\13\3\1\137\11\3\21\0\10\3\3\0\1\3\6\0"+
    "\17\3\1\140\5\3\21\0\10\3\3\0\1\3\6\0"+
    "\15\3\1\141\7\3\21\0\10\3\3\0\1\3\6\0"+
    "\15\3\1\142\7\3\21\0\10\3\3\0\1\3\6\0"+
    "\15\3\1\143\7\3\22\0\2\112\65\0\7\3\1\144"+
    "\3\0\1\3\6\0\25\3\21\0\7\3\1\145\3\0"+
    "\1\3\6\0\25\3\36\0\1\117\51\0\22\121\1\146"+
    "\45\121\21\0\1\117\1\122\46\0\10\3\3\0\1\3"+
    "\6\0\2\3\1\147\22\3\21\0\10\3\3\0\1\3"+
    "\6\0\3\3\1\150\21\3\21\0\10\3\3\0\1\3"+
    "\6\0\3\3\1\151\21\3\21\0\10\3\3\0\1\3"+
    "\6\0\2\3\1\152\22\3\21\0\10\3\3\0\1\3"+
    "\6\0\11\3\1\153\13\3\21\0\10\3\3\0\1\3"+
    "\6\0\12\3\1\154\12\3\21\0\10\3\3\0\1\3"+
    "\6\0\10\3\1\155\14\3\21\0\10\3\3\0\1\3"+
    "\6\0\15\3\1\156\7\3\21\0\10\3\3\0\1\3"+
    "\6\0\1\157\24\3\21\0\7\3\1\160\3\0\1\3"+
    "\6\0\25\3\21\0\10\3\3\0\1\3\6\0\10\3"+
    "\1\134\14\3\21\0\7\3\1\161\3\0\1\3\6\0"+
    "\25\3\21\0\10\3\3\0\1\3\6\0\2\3\1\162"+
    "\22\3\21\0\10\3\3\0\1\3\6\0\4\3\1\163"+
    "\20\3\21\0\10\3\3\0\1\3\6\0\2\3\1\164"+
    "\22\3\21\0\10\3\3\0\1\3\6\0\11\3\1\165"+
    "\13\3\21\0\10\3\3\0\1\3\6\0\4\3\1\166"+
    "\20\3\20\0\21\121\1\117\1\146\45\121\1\0\7\3"+
    "\1\167\3\0\1\3\6\0\25\3\21\0\10\3\3\0"+
    "\1\3\6\0\6\3\1\170\16\3\21\0\10\3\3\0"+
    "\1\3\6\0\5\3\1\171\17\3\21\0\10\3\3\0"+
    "\1\3\6\0\2\3\1\172\22\3\21\0\10\3\3\0"+
    "\1\3\6\0\5\3\1\173\17\3\21\0\10\3\3\0"+
    "\1\3\6\0\10\3\1\174\14\3\21\0\10\3\3\0"+
    "\1\3\6\0\4\3\1\175\20\3\21\0\10\3\3\0"+
    "\1\3\6\0\2\3\1\176\22\3\21\0\10\3\3\0"+
    "\1\3\6\0\5\3\1\177\17\3\21\0\7\3\1\200"+
    "\3\0\1\3\6\0\25\3\21\0\10\3\3\0\1\3"+
    "\6\0\13\3\1\201\11\3\21\0\7\3\1\202\3\0"+
    "\1\3\6\0\25\3\21\0\10\3\3\0\1\3\6\0"+
    "\11\3\1\203\13\3\21\0\10\3\3\0\1\3\6\0"+
    "\3\3\1\204\21\3\21\0\10\3\3\0\1\3\6\0"+
    "\5\3\1\205\17\3\21\0\10\3\3\0\1\3\6\0"+
    "\4\3\1\206\20\3\21\0\10\3\3\0\1\3\6\0"+
    "\4\3\1\207\20\3\21\0\10\3\3\0\1\3\6\0"+
    "\22\3\1\210\2\3\21\0\7\3\1\211\3\0\1\3"+
    "\6\0\25\3\21\0\10\3\3\0\1\3\6\0\14\3"+
    "\1\212\10\3\21\0\10\3\3\0\1\3\6\0\16\3"+
    "\1\213\6\3\21\0\10\3\3\0\1\3\6\0\2\3"+
    "\1\214\22\3\21\0\10\3\3\0\1\3\6\0\10\3"+
    "\1\215\14\3\21\0\10\3\3\0\1\3\6\0\4\3"+
    "\1\216\20\3\21\0\10\3\3\0\1\3\6\0\3\3"+
    "\1\217\21\3\21\0\10\3\3\0\1\3\6\0\3\3"+
    "\1\220\21\3\21\0\7\3\1\221\3\0\1\3\6\0"+
    "\25\3\21\0\10\3\3\0\1\3\6\0\4\3\1\222"+
    "\20\3\21\0\10\3\3\0\1\3\6\0\21\3\1\223"+
    "\3\3\21\0\10\3\3\0\1\3\6\0\7\3\1\224"+
    "\15\3\21\0\10\3\3\0\1\3\6\0\4\3\1\225"+
    "\20\3\21\0\7\3\1\226\3\0\1\3\6\0\25\3"+
    "\21\0\10\3\3\0\1\3\6\0\13\3\1\227\11\3"+
    "\21\0\10\3\3\0\1\3\6\0\10\3\1\230\14\3"+
    "\20\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6048];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\3\11\1\1\1\11\2\1\1\11"+
    "\14\1\1\11\6\1\10\11\1\0\1\1\1\0\2\1"+
    "\1\0\1\11\2\0\21\1\6\11\1\1\1\0\3\1"+
    "\1\11\1\1\2\0\23\1\1\0\62\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[152];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    private Symbol symbol(int type){return new Symbol(type, yyline, yycolumn);}
    private Symbol symbol(int type, Object value){return new Symbol(type, yyline, yycolumn, value);}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 186) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { /* ignore illegal chars */
            } 
            // fall through
          case 53: break;
          case 2: 
            { System.out.print("id ");  return symbol(sym.ID, yytext());
            } 
            // fall through
          case 54: break;
          case 3: 
            { System.out.print("intconstant "); return symbol(sym.INTCONSTANT, new Integer(yytext()));
            } 
            // fall through
          case 55: break;
          case 4: 
            { System.out.print("plus "); return symbol(sym.PLUS);
            } 
            // fall through
          case 56: break;
          case 5: 
            { System.out.print("minus "); return symbol(sym.MINUS);
            } 
            // fall through
          case 57: break;
          case 6: 
            { System.out.print("period "); return symbol(sym.PERIOD);
            } 
            // fall through
          case 58: break;
          case 7: 
            { System.out.print("\n");
            } 
            // fall through
          case 59: break;
          case 8: 
            { 
            } 
            // fall through
          case 60: break;
          case 9: 
            { System.out.print("division "); return symbol(sym.DIVISION);
            } 
            // fall through
          case 61: break;
          case 10: 
            { System.out.print("multiplication "); return symbol(sym.MULTIPLICATION);
            } 
            // fall through
          case 62: break;
          case 11: 
            { System.out.print("mod "); return symbol(sym.MOD);
            } 
            // fall through
          case 63: break;
          case 12: 
            { System.out.print("not " ); return symbol(sym.NOT);
            } 
            // fall through
          case 64: break;
          case 13: 
            { System.out.print("less "); return symbol(sym.LESS);
            } 
            // fall through
          case 65: break;
          case 14: 
            { System.out.print("assignop "); return symbol(sym.ASSIGNOP);
            } 
            // fall through
          case 66: break;
          case 15: 
            { System.out.print("greater "); return symbol(sym.GREATER);
            } 
            // fall through
          case 67: break;
          case 16: 
            { System.out.print("semicolon "); return symbol(sym.SEMICOLON);
            } 
            // fall through
          case 68: break;
          case 17: 
            { System.out.print("comma "); return symbol(sym.COMMA);
            } 
            // fall through
          case 69: break;
          case 18: 
            { System.out.print("leftparen "); return symbol(sym.LEFTPAREN);
            } 
            // fall through
          case 70: break;
          case 19: 
            { System.out.print("rightparen "); return symbol(sym.RIGHTPAREN);
            } 
            // fall through
          case 71: break;
          case 20: 
            { System.out.print("rightbracket "); return symbol(sym.RIGHTBRACKET);
            } 
            // fall through
          case 72: break;
          case 21: 
            { System.out.print("leftbracket "); return symbol(sym.LEFTBRACKET);
            } 
            // fall through
          case 73: break;
          case 22: 
            { System.out.print("leftbrace "); return symbol(sym.LEFTBRACE);
            } 
            // fall through
          case 74: break;
          case 23: 
            { System.out.print("rightbrace "); return symbol(sym.RIGHTBRACE);
            } 
            // fall through
          case 75: break;
          case 24: 
            { System.out.print("doubleconstant "); return symbol(sym.DOUBLECONSTANT, new Double(yytext()));
            } 
            // fall through
          case 76: break;
          case 25: 
            { System.out.print("stringconstant "); return symbol(sym.STRINGCONSTANT, yytext());
            } 
            // fall through
          case 77: break;
          case 26: 
            { System.out.printf("%s ",yytext()); return symbol(sym.IF);
            } 
            // fall through
          case 78: break;
          case 27: 
            { System.out.print("and " ); return symbol(sym.AND);
            } 
            // fall through
          case 79: break;
          case 28: 
            { System.out.print("or " ); return symbol(sym.OR);
            } 
            // fall through
          case 80: break;
          case 29: 
            { System.out.print("notequal "); return symbol(sym.NOTEQUAL);
            } 
            // fall through
          case 81: break;
          case 30: 
            { System.out.print("lessequal "); return symbol(sym.LESSEQUAL);
            } 
            // fall through
          case 82: break;
          case 31: 
            { System.out.print("equal "); return symbol(sym.EQUAL);
            } 
            // fall through
          case 83: break;
          case 32: 
            { System.out.print("greaterequal "); return symbol(sym.GREATEREQUAL);
            } 
            // fall through
          case 84: break;
          case 33: 
            { System.out.printf("%s ", yytext()); return symbol(sym.NEW);
            } 
            // fall through
          case 85: break;
          case 34: 
            { System.out.printf("%s ",yytext()); return symbol(sym.FOR);
            } 
            // fall through
          case 86: break;
          case 35: 
            { System.out.printf("%s ",yytext()); return symbol(sym.INT);
            } 
            // fall through
          case 87: break;
          case 36: 
            { System.out.printf("%s ",yytext()); return symbol(sym.ELSE);
            } 
            // fall through
          case 88: break;
          case 37: 
            { System.out.printf("%s ",yytext()); return symbol(sym.NULL);
            } 
            // fall through
          case 89: break;
          case 38: 
            { System.out.print("boolconstant "); return symbol(sym.BOOLEANCONSTANT);
            } 
            // fall through
          case 90: break;
          case 39: 
            { System.out.printf("%s ",yytext()); return symbol(sym.VOID);
            } 
            // fall through
          case 91: break;
          case 40: 
            { System.out.printf("%s ",yytext()); return symbol(sym.BREAK);
            } 
            // fall through
          case 92: break;
          case 41: 
            { System.out.printf("%s ",yytext()); return symbol(sym.CLASS);
            } 
            // fall through
          case 93: break;
          case 42: 
            { System.out.printf("%s ",yytext()); return symbol(sym.WHILE);
            } 
            // fall through
          case 94: break;
          case 43: 
            { System.out.printf("%s ",yytext()); return symbol(sym.READLN);
            } 
            // fall through
          case 95: break;
          case 44: 
            { System.out.printf("%s ",yytext()); return symbol(sym.RETURN);
            } 
            // fall through
          case 96: break;
          case 45: 
            { System.out.printf("%s ",yytext()); return symbol(sym.STRING);
            } 
            // fall through
          case 97: break;
          case 46: 
            { System.out.printf("%s ",yytext()); return symbol(sym.DOUBLE);
            } 
            // fall through
          case 98: break;
          case 47: 
            { System.out.printf("%s ",yytext()); return symbol(sym.EXTENDS);
            } 
            // fall through
          case 99: break;
          case 48: 
            { System.out.printf("%s ",yytext()); return symbol(sym.BOOLEAN);
            } 
            // fall through
          case 100: break;
          case 49: 
            { System.out.printf("%s ",yytext()); return symbol(sym.PRINTLN);
            } 
            // fall through
          case 101: break;
          case 50: 
            { System.out.printf("%s ",yytext()); return symbol(sym.NEWARRAY);
            } 
            // fall through
          case 102: break;
          case 51: 
            { System.out.printf("%s ",yytext()); return symbol(sym.INTERFACE);
            } 
            // fall through
          case 103: break;
          case 52: 
            { System.out.printf("%s ",yytext()); return symbol(sym.IMPLEMENTS);
            } 
            // fall through
          case 104: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}