/* The following code was generated by JFlex 1.3.5 on 11/2/24, 6:42 PM */

package cup.example;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.Symbol;
import java.lang.*;
import java.io.InputStreamReader;
import cup.example.sym;



/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.3.5
 * on 11/2/24, 6:42 PM from the specification file
 * <tt>file:/C:/Users/georg/Desktop/JavaProjects/CupProject/lexer.jflex</tt>
 */
public class Lexer implements sym, java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  final public static int YYEOF = -1;

  /** initial size of the lookahead buffer */
  final private static int YY_BUFFERSIZE = 16384;

  /** lexical states */
  final public static int CODESEG = 1;
  final public static int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  final private static String yycmap_packed = 
    "\11\10\1\3\1\2\1\0\1\3\1\1\16\10\4\0\1\3\1\37"+
    "\2\0\1\7\3\0\1\32\1\33\1\6\1\30\1\40\1\31\1\0"+
    "\1\5\12\4\1\0\1\27\1\34\1\35\1\36\2\0\3\7\1\24"+
    "\1\11\1\15\1\7\1\26\1\14\2\7\1\12\1\7\1\16\1\23"+
    "\2\7\1\20\1\13\1\17\1\21\1\22\1\25\3\7\1\41\1\0"+
    "\1\42\1\0\1\7\1\0\3\7\1\24\1\11\1\15\1\7\1\26"+
    "\1\14\2\7\1\12\1\7\1\16\1\23\2\7\1\20\1\13\1\17"+
    "\1\21\1\22\1\25\3\7\1\43\1\0\1\44\1\0\41\10\2\0"+
    "\4\7\4\0\1\7\2\0\1\10\7\0\1\7\4\0\1\7\5\0"+
    "\27\7\1\0\37\7\1\0\u01ca\7\4\0\14\7\16\0\5\7\7\0"+
    "\1\7\1\0\1\7\21\0\160\10\5\7\1\0\2\7\2\0\4\7"+
    "\1\0\1\7\6\0\1\7\1\0\3\7\1\0\1\7\1\0\24\7"+
    "\1\0\123\7\1\0\213\7\1\0\5\10\2\0\246\7\1\0\46\7"+
    "\2\0\1\7\6\0\51\7\6\0\1\7\1\0\55\10\1\0\1\10"+
    "\1\0\2\10\1\0\2\10\1\0\1\10\10\0\33\7\4\0\4\7"+
    "\15\0\6\10\5\0\1\7\4\0\13\10\1\0\1\10\3\0\53\7"+
    "\37\10\4\0\2\7\1\10\143\7\1\0\1\7\10\10\1\0\6\10"+
    "\2\7\2\10\1\0\4\10\2\7\12\10\3\7\2\0\1\7\17\0"+
    "\1\10\1\7\1\10\36\7\33\10\2\0\131\7\13\10\1\7\16\0"+
    "\12\10\41\7\11\10\2\7\4\0\1\7\2\0\1\10\30\7\4\10"+
    "\1\7\11\10\1\7\3\10\1\7\5\10\22\0\31\7\3\10\4\0"+
    "\13\7\5\0\30\7\1\0\6\7\1\0\2\10\6\0\10\10\52\7"+
    "\72\10\66\7\3\10\1\7\22\10\1\7\7\10\12\7\2\10\2\0"+
    "\12\10\1\0\20\7\3\10\1\0\10\7\2\0\2\7\2\0\26\7"+
    "\1\0\7\7\1\0\1\7\3\0\4\7\2\0\1\10\1\7\7\10"+
    "\2\0\2\10\2\0\3\10\1\7\10\0\1\10\4\0\2\7\1\0"+
    "\3\7\2\10\2\0\12\10\4\7\7\0\2\7\1\0\1\10\2\0"+
    "\3\10\1\0\6\7\4\0\2\7\2\0\26\7\1\0\7\7\1\0"+
    "\2\7\1\0\2\7\1\0\2\7\2\0\1\10\1\0\5\10\4\0"+
    "\2\10\2\0\3\10\3\0\1\10\7\0\4\7\1\0\1\7\7\0"+
    "\14\10\3\7\1\10\13\0\3\10\1\0\11\7\1\0\3\7\1\0"+
    "\26\7\1\0\7\7\1\0\2\7\1\0\5\7\2\0\1\10\1\7"+
    "\10\10\1\0\3\10\1\0\3\10\2\0\1\7\17\0\2\7\2\10"+
    "\2\0\12\10\1\0\1\7\7\0\1\7\6\10\1\0\3\10\1\0"+
    "\10\7\2\0\2\7\2\0\26\7\1\0\7\7\1\0\2\7\1\0"+
    "\5\7\2\0\1\10\1\7\7\10\2\0\2\10\2\0\3\10\7\0"+
    "\3\10\4\0\2\7\1\0\3\7\2\10\2\0\12\10\1\0\1\7"+
    "\20\0\1\10\1\7\1\0\6\7\3\0\3\7\1\0\4\7\3\0"+
    "\2\7\1\0\1\7\1\0\2\7\3\0\2\7\3\0\3\7\3\0"+
    "\14\7\4\0\5\10\3\0\3\10\1\0\4\10\2\0\1\7\6\0"+
    "\1\10\16\0\12\10\11\0\1\7\6\0\5\10\10\7\1\0\3\7"+
    "\1\0\27\7\1\0\20\7\2\0\1\10\1\7\7\10\1\0\3\10"+
    "\1\0\4\10\7\0\2\10\1\0\3\7\2\0\1\7\2\0\2\7"+
    "\2\10\2\0\12\10\20\0\1\7\3\10\1\0\10\7\1\0\3\7"+
    "\1\0\27\7\1\0\12\7\1\0\5\7\2\0\1\10\1\7\7\10"+
    "\1\0\3\10\1\0\4\10\7\0\2\10\6\0\2\7\1\0\2\7"+
    "\2\10\2\0\12\10\1\0\2\7\1\10\14\0\4\10\11\7\1\0"+
    "\3\7\1\0\51\7\2\10\1\7\7\10\1\0\3\10\1\0\4\10"+
    "\1\7\5\0\3\7\1\10\7\0\3\7\2\10\2\0\12\10\12\0"+
    "\6\7\1\0\3\10\1\0\22\7\3\0\30\7\1\0\11\7\1\0"+
    "\1\7\2\0\7\7\3\0\1\10\4\0\6\10\1\0\1\10\1\0"+
    "\10\10\6\0\12\10\2\0\2\10\15\0\60\7\1\10\2\7\7\10"+
    "\4\0\10\7\10\10\1\0\12\10\47\0\2\7\1\0\1\7\1\0"+
    "\5\7\1\0\30\7\1\0\1\7\1\0\12\7\1\10\2\7\11\10"+
    "\1\7\2\0\5\7\1\0\1\7\1\0\7\10\1\0\12\10\2\0"+
    "\4\7\40\0\1\7\27\0\2\10\6\0\12\10\13\0\1\10\1\0"+
    "\1\10\1\0\1\10\4\0\2\10\10\7\1\0\44\7\4\0\24\10"+
    "\1\0\2\10\5\7\13\10\1\0\44\10\11\0\1\10\71\0\53\7"+
    "\24\10\1\7\12\10\6\0\6\7\4\10\4\7\3\10\1\7\3\10"+
    "\2\7\7\10\3\7\4\10\15\7\14\10\1\7\17\10\2\0\46\7"+
    "\1\0\1\7\5\0\1\7\2\0\53\7\1\0\u014d\7\1\0\4\7"+
    "\2\0\7\7\1\0\1\7\1\0\4\7\2\0\51\7\1\0\4\7"+
    "\2\0\41\7\1\0\4\7\2\0\7\7\1\0\1\7\1\0\4\7"+
    "\2\0\17\7\1\0\71\7\1\0\4\7\2\0\103\7\2\0\3\10"+
    "\40\0\20\7\20\0\126\7\2\0\6\7\3\0\u026c\7\2\0\21\7"+
    "\1\0\32\7\5\0\113\7\3\0\13\7\7\0\22\7\4\10\11\0"+
    "\23\7\3\10\13\0\22\7\2\10\14\0\15\7\1\0\3\7\1\0"+
    "\2\10\14\0\64\7\40\10\3\0\1\7\3\0\2\7\1\10\2\0"+
    "\12\10\41\0\17\10\6\0\131\7\7\0\5\7\2\10\42\7\1\10"+
    "\1\7\5\0\106\7\12\0\37\7\1\0\14\10\4\0\14\10\12\0"+
    "\12\10\36\7\2\0\5\7\13\0\54\7\4\0\32\7\6\0\12\10"+
    "\46\0\27\7\5\10\4\0\65\7\12\10\1\0\35\10\2\0\13\10"+
    "\6\0\12\10\15\0\1\7\10\0\16\10\1\0\20\10\61\0\5\10"+
    "\57\7\21\10\10\7\3\0\12\10\21\0\11\10\14\0\3\10\36\7"+
    "\15\10\2\7\12\10\54\7\16\10\14\0\44\7\24\10\10\0\12\10"+
    "\3\0\3\7\12\10\44\7\2\0\11\7\7\0\53\7\2\0\3\7"+
    "\20\0\3\10\1\0\25\10\4\7\1\10\6\7\1\10\2\7\3\10"+
    "\1\7\5\0\300\7\100\10\u0116\7\2\0\6\7\2\0\46\7\2\0"+
    "\6\7\2\0\10\7\1\0\1\7\1\0\1\7\1\0\1\7\1\0"+
    "\37\7\2\0\65\7\1\0\7\7\1\0\1\7\3\0\3\7\1\0"+
    "\7\7\3\0\4\7\2\0\6\7\4\0\15\7\5\0\3\7\1\0"+
    "\7\7\16\0\5\10\32\0\5\10\20\0\2\7\23\0\1\7\13\0"+
    "\5\10\1\0\12\10\1\0\1\7\15\0\1\7\20\0\15\7\3\0"+
    "\41\7\17\0\15\10\4\0\1\10\3\0\14\10\21\0\1\7\4\0"+
    "\1\7\2\0\12\7\1\0\1\7\3\0\5\7\6\0\1\7\1\0"+
    "\1\7\1\0\1\7\1\0\4\7\1\0\13\7\2\0\4\7\5\0"+
    "\5\7\4\0\1\7\21\0\51\7\u0a77\0\345\7\6\0\4\7\3\10"+
    "\2\7\14\0\46\7\1\0\1\7\5\0\1\7\2\0\70\7\7\0"+
    "\1\7\17\0\1\10\27\7\11\0\7\7\1\0\7\7\1\0\7\7"+
    "\1\0\7\7\1\0\7\7\1\0\7\7\1\0\7\7\1\0\7\7"+
    "\1\0\40\10\57\0\1\7\u01d5\0\3\7\31\0\11\7\6\10\1\0"+
    "\5\7\2\0\5\7\4\0\126\7\2\0\2\10\2\0\3\7\1\0"+
    "\132\7\1\0\4\7\5\0\53\7\1\0\136\7\21\0\40\7\60\0"+
    "\20\7\u0200\0\u19c0\7\100\0\u568d\7\103\0\56\7\2\0\u010d\7\3\0"+
    "\20\7\12\10\2\7\24\0\57\7\1\10\4\0\12\10\1\0\37\7"+
    "\2\10\120\7\2\10\45\0\11\7\2\0\147\7\2\0\100\7\5\0"+
    "\2\7\1\0\1\7\1\0\5\7\30\0\20\7\1\10\3\7\1\10"+
    "\4\7\1\10\27\7\5\10\4\0\1\10\13\0\1\7\7\0\64\7"+
    "\14\0\2\10\62\7\22\10\12\0\12\10\6\0\22\10\6\7\3\0"+
    "\1\7\1\0\2\7\13\10\34\7\10\10\2\0\27\7\15\10\14\0"+
    "\35\7\3\0\4\10\57\7\16\10\16\0\1\7\12\10\6\0\5\7"+
    "\1\10\12\7\12\10\5\7\1\0\51\7\16\10\11\0\3\7\1\10"+
    "\10\7\2\10\2\0\12\10\6\0\27\7\3\0\1\7\3\10\62\7"+
    "\1\10\1\7\3\10\2\7\2\10\5\7\2\10\1\7\1\10\1\7"+
    "\30\0\3\7\2\0\13\7\5\10\2\0\3\7\2\10\12\0\6\7"+
    "\2\0\6\7\2\0\6\7\11\0\7\7\1\0\7\7\1\0\53\7"+
    "\1\0\16\7\6\0\163\7\10\10\1\0\2\10\2\0\12\10\6\0"+
    "\u2ba4\7\14\0\27\7\4\0\61\7\u2104\0\u016e\7\2\0\152\7\46\0"+
    "\7\7\14\0\5\7\5\0\1\7\1\10\12\7\1\0\15\7\1\0"+
    "\5\7\1\0\1\7\1\0\2\7\1\0\2\7\1\0\154\7\41\0"+
    "\u016b\7\22\0\100\7\2\0\66\7\50\0\15\7\3\0\20\10\20\0"+
    "\20\10\3\0\2\7\30\0\3\7\31\0\1\7\6\0\5\7\1\0"+
    "\207\7\2\0\1\10\4\0\1\7\13\0\12\10\7\0\32\7\4\0"+
    "\1\7\1\0\32\7\13\0\131\7\3\0\6\7\2\0\6\7\2\0"+
    "\6\7\2\0\3\7\3\0\2\7\3\0\2\7\22\0\3\10\4\0";

  /** 
   * Translates characters to character classes
   */
  final private static char [] yycmap = yy_unpack_cmap(yycmap_packed);

  /** 
   * Translates a state to a row index in the transition table
   */
  final private static int yy_rowMap [] = { 
        0,    37,    74,   111,    74,   148,    74,    74,   185,   222, 
      259,   185,   296,   333,   370,    74,    74,    74,    74,    74, 
      407,   444,   481,   518,    74,    74,    74,    74,    74,   555, 
      185,   592,   629,   666,   703,    74,    74,    74,    74,   740, 
      185,   777,   814,   851,   185,   888,   185,   925,   962,   185, 
      185
  };

  /** 
   * The packed transition table of the DFA (part 0)
   */
  final private static String yy_packed0 = 
    "\1\3\1\4\2\5\1\6\1\7\1\10\1\11\1\3"+
    "\1\12\2\11\1\13\1\11\1\14\1\11\1\15\1\11"+
    "\1\16\2\11\1\17\1\11\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\45\3\47\0\1\5\46\0\1\6\44\0"+
    "\1\11\2\0\20\11\22\0\1\11\2\0\3\11\1\36"+
    "\14\11\22\0\1\11\2\0\6\11\1\37\1\40\10\11"+
    "\22\0\1\11\2\0\2\11\1\41\15\11\22\0\1\11"+
    "\2\0\14\11\1\42\3\11\22\0\1\11\2\0\17\11"+
    "\1\43\53\0\1\44\44\0\1\45\44\0\1\46\44\0"+
    "\1\47\13\0\1\11\2\0\4\11\1\50\13\11\22\0"+
    "\1\11\2\0\10\11\1\51\7\11\22\0\1\11\2\0"+
    "\10\11\1\52\7\11\22\0\1\11\2\0\5\11\1\53"+
    "\12\11\22\0\1\11\2\0\5\11\1\54\12\11\22\0"+
    "\1\11\2\0\2\11\1\55\15\11\22\0\1\11\2\0"+
    "\12\11\1\56\5\11\22\0\1\11\2\0\15\11\1\57"+
    "\2\11\22\0\1\11\2\0\3\11\1\60\14\11\22\0"+
    "\1\11\2\0\11\11\1\61\6\11\22\0\1\11\2\0"+
    "\2\11\1\62\15\11\22\0\1\11\2\0\7\11\1\63"+
    "\10\11\16\0";

  /** 
   * The transition table of the DFA
   */
  final private static int yytrans [] = yy_unpack();


  /* error codes */
  final private static int YY_UNKNOWN_ERROR = 0;
  final private static int YY_ILLEGAL_STATE = 1;
  final private static int YY_NO_MATCH = 2;
  final private static int YY_PUSHBACK_2BIG = 3;

  /* error messages for the codes above */
  final private static String YY_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Internal error: unknown state",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * YY_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private final static byte YY_ATTRIBUTE[] = {
     0,  0,  9,  1,  9,  1,  9,  9,  1,  1,  1,  1,  1,  1,  1,  9, 
     9,  9,  9,  9,  1,  1,  1,  1,  9,  9,  9,  9,  9,  1,  1,  1, 
     1,  1,  1,  9,  9,  9,  9,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1
  };

  /** the input device */
  private java.io.Reader yy_reader;

  /** the current state of the DFA */
  private int yy_state;

  /** the current lexical state */
  private int yy_lexical_state = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char yy_buffer[] = new char[YY_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int yy_markedPos;

  /** the textposition at the last state to be included in yytext */
  private int yy_pushbackPos;

  /** the current text position in the buffer */
  private int yy_currentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int yy_startRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int yy_endRead;

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
   * yy_atBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean yy_atBOL = true;

  /** yy_atEOF == true <=> the scanner is at the EOF */
  private boolean yy_atEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean yy_eof_done;

  /* user code: */
	

    public Lexer(ComplexSymbolFactory sf, java.io.InputStream is){
		this(is);
        symbolFactory = sf;
    }
	public Lexer(ComplexSymbolFactory sf, java.io.Reader reader){
		this(reader);
        symbolFactory = sf;
    }
    
    private StringBuffer sb;
    private ComplexSymbolFactory symbolFactory;
    private int csline,cscolumn;

    public Symbol symbol(String name, int code){
		return symbolFactory.newSymbol(name, code,
						new Location(yyline+1,yycolumn+1, yychar), // -yylength()
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength())
				);
    }
    public Symbol symbol(String name, int code, String lexem){
	return symbolFactory.newSymbol(name, code, 
						new Location(yyline+1, yycolumn +1, yychar), 
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength()), lexem);
    }
    
    protected void emit_warning(String message){
    	System.out.println("scanner warning: " + message + " at : 2 "+ 
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }
    
    protected void emit_error(String message){
    	System.out.println("scanner error: " + message + " at : 2" + 
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.yy_reader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the split, compressed DFA transition table.
   *
   * @return the unpacked transition table
   */
  private static int [] yy_unpack() {
    int [] trans = new int[999];
    int offset = 0;
    offset = yy_unpack(yy_packed0, offset, trans);
    return trans;
  }

  /** 
   * Unpacks the compressed DFA transition table.
   *
   * @param packed   the packed transition table
   * @return         the index of the last entry
   */
  private static int yy_unpack(String packed, int offset, int [] trans) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do trans[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] yy_unpack_cmap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2300) {
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
   * @exception   IOException  if any I/O-Error occurs
   */
  private boolean yy_refill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (yy_startRead > 0) {
      System.arraycopy(yy_buffer, yy_startRead, 
                       yy_buffer, 0, 
                       yy_endRead-yy_startRead);

      /* translate stored positions */
      yy_endRead-= yy_startRead;
      yy_currentPos-= yy_startRead;
      yy_markedPos-= yy_startRead;
      yy_pushbackPos-= yy_startRead;
      yy_startRead = 0;
    }

    /* is the buffer big enough? */
    if (yy_currentPos >= yy_buffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[yy_currentPos*2];
      System.arraycopy(yy_buffer, 0, newBuffer, 0, yy_buffer.length);
      yy_buffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = yy_reader.read(yy_buffer, yy_endRead, 
                                            yy_buffer.length-yy_endRead);

    if (numRead < 0) {
      return true;
    }
    else {
      yy_endRead+= numRead;  
      return false;
    }
  }


  /**
   * Closes the input stream.
   */
  final public void yyclose() throws java.io.IOException {
    yy_atEOF = true;            /* indicate end of file */
    yy_endRead = yy_startRead;  /* invalidate buffer    */

    if (yy_reader != null)
      yy_reader.close();
  }


  /**
   * Closes the current stream, and resets the
   * scanner to read from a new input stream.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>YY_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  final public void yyreset(java.io.Reader reader) throws java.io.IOException {
    yyclose();
    yy_reader = reader;
    yy_atBOL  = true;
    yy_atEOF  = false;
    yy_endRead = yy_startRead = 0;
    yy_currentPos = yy_markedPos = yy_pushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    yy_lexical_state = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  final public int yystate() {
    return yy_lexical_state;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  final public void yybegin(int newState) {
    yy_lexical_state = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  final public String yytext() {
    return new String( yy_buffer, yy_startRead, yy_markedPos-yy_startRead );
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
  final public char yycharat(int pos) {
    return yy_buffer[yy_startRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  final public int yylength() {
    return yy_markedPos-yy_startRead;
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
  private void yy_ScanError(int errorCode) {
    String message;
    try {
      message = YY_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = YY_ERROR_MSG[YY_UNKNOWN_ERROR];
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
  private void yypushback(int number)  {
    if ( number > yylength() )
      yy_ScanError(YY_PUSHBACK_2BIG);

    yy_markedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void yy_do_eof() throws java.io.IOException {
    if (!yy_eof_done) {
      yy_eof_done = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int yy_input;
    int yy_action;

    // cached fields:
    int yy_currentPos_l;
    int yy_startRead_l;
    int yy_markedPos_l;
    int yy_endRead_l = yy_endRead;
    char [] yy_buffer_l = yy_buffer;
    char [] yycmap_l = yycmap;

    int [] yytrans_l = yytrans;
    int [] yy_rowMap_l = yy_rowMap;
    byte [] yy_attr_l = YY_ATTRIBUTE;

    while (true) {
      yy_markedPos_l = yy_markedPos;

      yychar+= yy_markedPos_l-yy_startRead;

      boolean yy_r = false;
      for (yy_currentPos_l = yy_startRead; yy_currentPos_l < yy_markedPos_l;
                                                             yy_currentPos_l++) {
        switch (yy_buffer_l[yy_currentPos_l]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          yy_r = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          yy_r = true;
          break;
        case '\n':
          if (yy_r)
            yy_r = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          yy_r = false;
          yycolumn++;
        }
      }

      if (yy_r) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean yy_peek;
        if (yy_markedPos_l < yy_endRead_l)
          yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        else if (yy_atEOF)
          yy_peek = false;
        else {
          boolean eof = yy_refill();
          yy_markedPos_l = yy_markedPos;
          yy_buffer_l = yy_buffer;
          if (eof) 
            yy_peek = false;
          else 
            yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        }
        if (yy_peek) yyline--;
      }
      yy_action = -1;

      yy_startRead_l = yy_currentPos_l = yy_currentPos = 
                       yy_startRead = yy_markedPos_l;

      yy_state = yy_lexical_state;


      yy_forAction: {
        while (true) {

          if (yy_currentPos_l < yy_endRead_l)
            yy_input = yy_buffer_l[yy_currentPos_l++];
          else if (yy_atEOF) {
            yy_input = YYEOF;
            break yy_forAction;
          }
          else {
            // store back cached positions
            yy_currentPos  = yy_currentPos_l;
            yy_markedPos   = yy_markedPos_l;
            boolean eof = yy_refill();
            // get translated positions and possibly new buffer
            yy_currentPos_l  = yy_currentPos;
            yy_markedPos_l   = yy_markedPos;
            yy_buffer_l      = yy_buffer;
            yy_endRead_l     = yy_endRead;
            if (eof) {
              yy_input = YYEOF;
              break yy_forAction;
            }
            else {
              yy_input = yy_buffer_l[yy_currentPos_l++];
            }
          }
          int yy_next = yytrans_l[ yy_rowMap_l[yy_state] + yycmap_l[yy_input] ];
          if (yy_next == -1) break yy_forAction;
          yy_state = yy_next;

          int yy_attributes = yy_attr_l[yy_state];
          if ( (yy_attributes & 1) == 1 ) {
            yy_action = yy_state; 
            yy_markedPos_l = yy_currentPos_l; 
            if ( (yy_attributes & 8) == 8 ) break yy_forAction;
          }

        }
      }

      // store back cached position
      yy_markedPos = yy_markedPos_l;

      switch (yy_action) {

        case 37: 
          {  return symbolFactory.newSymbol("GE", sym.GE);  }
        case 52: break;
        case 36: 
          {  return symbolFactory.newSymbol("EQ", sym.EQ);  }
        case 53: break;
        case 35: 
          {  return symbolFactory.newSymbol("LE", sym.LE);  }
        case 54: break;
        case 30: 
          {  return symbolFactory.newSymbol("IF", sym.IF);  }
        case 55: break;
        case 20: 
          {  return symbolFactory.newSymbol("LT", sym.LT);  }
        case 56: break;
        case 22: 
          {  return symbolFactory.newSymbol("GT", sym.GT);  }
        case 57: break;
        case 8: 
        case 9: 
        case 10: 
        case 12: 
        case 13: 
        case 14: 
        case 29: 
        case 31: 
        case 32: 
        case 33: 
        case 34: 
        case 39: 
        case 41: 
        case 42: 
        case 43: 
        case 45: 
        case 47: 
        case 48: 
          {  return symbolFactory.newSymbol("ID", sym.ID, yytext());  }
        case 58: break;
        case 46: 
          {  return symbolFactory.newSymbol("VOID", sym.VOID);  }
        case 59: break;
        case 44: 
          {  return symbolFactory.newSymbol("ELSE", sym.ELSE);  }
        case 60: break;
        case 15: 
          {  return symbolFactory.newSymbol("SEMI", sym.SEMI);  }
        case 61: break;
        case 16: 
          {  return symbolFactory.newSymbol("PLUS", sym.PLUS);  }
        case 62: break;
        case 5: 
          {  return symbolFactory.newSymbol("NUMBER", sym.NUMBER, Integer.parseInt(yytext()));  }
        case 63: break;
        case 3: 
        case 4: 
          {                                }
        case 64: break;
        case 49: 
          {  return symbolFactory.newSymbol("WHILE", sym.WHILE);  }
        case 65: break;
        case 7: 
          {  return symbolFactory.newSymbol("TIMES", sym.TIMES);  }
        case 66: break;
        case 17: 
          {  return symbolFactory.newSymbol("MINUS", sym.MINUS);  }
        case 67: break;
        case 24: 
          {  return symbolFactory.newSymbol("COMMA", sym.COMMA);  }
        case 68: break;
        case 40: 
          {  return symbolFactory.newSymbol("INT", sym.INT);  }
        case 69: break;
        case 38: 
          {  return symbolFactory.newSymbol("NEQ", sym.NEQ);  }
        case 70: break;
        case 2: 
        case 23: 
          {  emit_warning("Unrecognized character '" +yytext()+"' -- ignored");  }
        case 71: break;
        case 50: 
          {  return symbolFactory.newSymbol("RETURN", sym.RETURN);  }
        case 72: break;
        case 28: 
          {  return symbolFactory.newSymbol("RBRACE", sym.RBRACE);  }
        case 73: break;
        case 27: 
          {  return symbolFactory.newSymbol("LBRACE", sym.LBRACE);  }
        case 74: break;
        case 26: 
          {  return symbolFactory.newSymbol("RBRACK", sym.RBRACK);  }
        case 75: break;
        case 11: 
          {  return symbolFactory.newSymbol("UMINUS", sym.UMINUS);  }
        case 76: break;
        case 6: 
          {  return symbolFactory.newSymbol("DIVIDE", sym.DIVIDE);  }
        case 77: break;
        case 18: 
          {  return symbolFactory.newSymbol("LPAREN", sym.LPAREN);  }
        case 78: break;
        case 19: 
          {  return symbolFactory.newSymbol("RPAREN", sym.RPAREN);  }
        case 79: break;
        case 21: 
          {  return symbolFactory.newSymbol("ASSIGN", sym.ASSIGN);  }
        case 80: break;
        case 25: 
          {  return symbolFactory.newSymbol("LBRACK", sym.LBRACK);  }
        case 81: break;
        default: 
          if (yy_input == YYEOF && yy_startRead == yy_currentPos) {
            yy_atEOF = true;
            yy_do_eof();
              {     return symbolFactory.newSymbol("EOF",sym.EOF);
 }
          } 
          else {
            yy_ScanError(YY_NO_MATCH);
          }
      }
    }
  }


}
