grammar Query;

@members {
    // This method makes the lexer or parser stop running if it encounters
    // invalid input and throw a RuntimeException.
    public void reportErrorsAsExceptions() {
        //removeErrorListeners();

        addErrorListener(new ExceptionThrowingErrorListener());
    }

    private static class ExceptionThrowingErrorListener extends BaseErrorListener {
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer,
                Object offendingSymbol, int line, int charPositionInLine,
                String msg, RecognitionException e) {
            throw new RuntimeException(msg);
        }
    }
}

/* Entry point of parser */

query : orExpr
    | randomReview
    | getRestaurant
    | addRestaurant
    | addUser
    | addReview
    | EOF;

    randomReview: 'randomReview' LPAREN STRING RPAREN ;
    getRestaurant : 'getRestaurant' LPAREN STRING RPAREN ;
    addRestaurant : 'addRestaurant' LPAREN json RPAREN;
    addUser : 'addUser' LPAREN json RPAREN;
    addReview : 'addReview' LPAREN json RPAREN;

/* Have lowest precedence */
orExpr : andExpr (OR andExpr)*;

/* Have higher precedence */
andExpr : atom ( AND atom)*;

atom : in|category|rating|price|name|LPAREN orExpr RPAREN;


in : IN LPAREN STRING RPAREN;
category : CATEGORY LPAREN STRING RPAREN;
name : NAME LPAREN STRING RPAREN;
rating : RATING LPAREN RANGE RPAREN;
price : PRICE LPAREN RANGE RPAREN;


RANGE : [1-5]'..'[1-5];
LPAREN : '(';
RPAREN : ')';
OR : '||';
AND : '&&';
STRING: '"' ([a-zA-Z0-9']|' ')+ '"';
IN : 'in';
CATEGORY : 'category';
NAME : 'name';
RATING : 'rating';
PRICE : 'price';

json: JSONSTRING;
JSONSTRING : '{'(~[<>])*'}';
WS  :   [ \t\n\r]+ -> skip ;