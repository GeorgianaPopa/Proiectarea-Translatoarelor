package cup.example;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.Symbol;
import java.lang.*;
import java.io.InputStreamReader;
import cup.example.sym;


%%

%ignorecase
%class Lexer
%implements sym
%public
%unicode
%line
%column
%cup
%char
%{
	

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
%}

Newline    = \r | \n | \r\n
Whitespace = [ \t\f] | {Newline}
Number     = [0-9]+

/* comments */
Comment = {TraditionalComment} | {EndOfLineComment}
TraditionalComment = "/*" {CommentContent} \*+ "/"
EndOfLineComment = "//" [^\r\n]* {Newline}
CommentContent = ( [^*] | \*+[^*/] )*

ident = ([:jletter:] | "_" ) ([:jletterdigit:] | [:jletter:] | "_" )*


%eofval{
    return symbolFactory.newSymbol("EOF",sym.EOF);
%eofval}

%state CODESEG

%%  

<YYINITIAL> {

  {Whitespace} {                              }
    "else"       { return symbolFactory.newSymbol("ELSE", sym.ELSE); }
    "if"         { return symbolFactory.newSymbol("IF", sym.IF); }
    "INT"        { return symbolFactory.newSymbol("INT", sym.INT); }
    "return"     { return symbolFactory.newSymbol("RETURN", sym.RETURN); }
    "void"       { return symbolFactory.newSymbol("VOID", sym.VOID); }
    "while"      { return symbolFactory.newSymbol("WHILE", sym.WHILE); }
    
    ";"          { return symbolFactory.newSymbol("SEMI", sym.SEMI); }
    "+"          { return symbolFactory.newSymbol("PLUS", sym.PLUS); }
    "-"          { return symbolFactory.newSymbol("MINUS", sym.MINUS); }
    "*"          { return symbolFactory.newSymbol("TIMES", sym.TIMES); }
    "n"          { return symbolFactory.newSymbol("UMINUS", sym.UMINUS); }
    "("          { return symbolFactory.newSymbol("LPAREN", sym.LPAREN); }
    ")"          { return symbolFactory.newSymbol("RPAREN", sym.RPAREN); }
    "/"          { return symbolFactory.newSymbol("DIVIDE", sym.DIVIDE); }
    "<="         { return symbolFactory.newSymbol("LE", sym.LE); }
    "<"          { return symbolFactory.newSymbol("LT", sym.LT); }
    ">="         { return symbolFactory.newSymbol("GE", sym.GE); }
    ">"          { return symbolFactory.newSymbol("GT", sym.GT); }
    "=="         { return symbolFactory.newSymbol("EQ", sym.EQ); }
    "!="         { return symbolFactory.newSymbol("NEQ", sym.NEQ); }
    "="          { return symbolFactory.newSymbol("ASSIGN", sym.ASSIGN); }
    ","          { return symbolFactory.newSymbol("COMMA", sym.COMMA); }
    "["          { return symbolFactory.newSymbol("LBRACK", sym.LBRACK); }
    "]"          { return symbolFactory.newSymbol("RBRACK", sym.RBRACK); }
    "{"          { return symbolFactory.newSymbol("LBRACE", sym.LBRACE); }
    "}"          { return symbolFactory.newSymbol("RBRACE", sym.RBRACE); }
  
   {ID}      { return symbolFactory.newSymbol("ID", sym.ID, yytext()); }
   {Number}     { return symbolFactory.newSymbol("NUMBER", sym.NUMBER, Integer.parseInt(yytext())); }
}



// error fallback
.|\n          { emit_warning("Unrecognized character '" +yytext()+"' -- ignored"); }
