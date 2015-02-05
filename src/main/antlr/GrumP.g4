grammar GrumP;

//statement containers
grump : topLevelStatements? EOF;

topLevelStatements
    : topLevelStatement+
    ;

topLevelStatement 
    : define
    | example
    ;

//define
define
    : DEFINE Symbol EXTENDS defineType defineBlock
    ;

defineType
    : Symbol
    | builtin
    ;

defineBlock
    : LBRACE defineStatements RBRACE
    ;

defineStatements
    : constructor* ( parameterStatement | sketchStatement | constraintStatement )*
    ;

//constructor
constructor
    : CONSTRUCTOR Symbol? parameters LBRACE constructorStatments RBRACE
    ;

constructorStatments
    : ( parameterStatement | sketchStatement | constraintStatement )*
    ;

//example
example
    : EXAMPLE (Symbol)? LBRACE exampleStatements RBRACE
    ;

exampleStatements
    : ( parameterStatement | sketchStatement | constraintStatement )*
    ;

//parameter
parameterStatement
    : CONSTANT? PARAMETER parameterAssignment ( COMMA parameterAssignment )* SEMI
    ; 

parameterAssignment
    : Symbol ASSIGN expression
    ;

//sketch
sketchStatement
    : sketchType sketchAssignment ( COMMA sketchAssignment )* SEMI
    ; 

sketchAssignment
    : Symbol ASSIGN sketchConstruction defineBlock?
    | Symbol ASSIGN Symbol
    ;

sketchConstruction
    : sketchType (DOT Symbol)? arguments
    ;

sketchType
    : Symbol
    | builtin
    ;

//constraint
constraintStatement 
    : CONSTRAINT constraint ( COMMA constraint )*  SEMI
    ;
    
constraint
    : constraintExpression (EQUALS constraintExpression)+
    ;

constraintExpression
    : expression
    | DISTANCE LPAREN expression COMMA expression RPAREN
    ;

//arguments
arguments
    : LPAREN (expression ( COMMA expression )*)? RPAREN
    ;

//expressions
expression
    : constant
    | reference
    | sketchConstruction
    | LPAREN expression RPAREN
    | expression ( ADD | SUB ) expression
    | expression ( MUL | DIV ) expression
    | ( SQUARE | SQRT | SIN | COS | ASIN | ACOS ) LPAREN expression RPAREN
    ;

//parameters
parameters 
    : LPAREN ( parameter ( COMMA parameter)* )? RPAREN
    ;

parameter
    : parameterType Symbol
    ;

parameterType
    : PARAMETER
    | sketchType
    ;

//etc
builtin
    : SKETCH
    | POINT
    ;
    
constant
    : IntegerLiteral
    | FloatingPointLiteral
    | PI
    | GOLDEN_RATIO
    ;

reference
    : Symbol ( DOT Symbol )*
    | THIS (DOT Symbol)*
    ;

THIS            : 'this';

EXAMPLE         : 'example';
SKETCH          : 'Sketch';
POINT           : 'Point';

DISTANCE        : 'distance';

CONSTANT        : 'constant';
CONSTRAINT      : 'constraint';
CONSTRUCTOR     : 'constructor';
DECLARE         : 'declare';
DEFINE          : 'define';
DISPLAY         : 'display';
PARAMETER       : 'parameter';

EQUATION        : 'equation';
EXPRESSION      : 'expression';
EXTENDS         : 'extends';

SQUARE          : 'square';
SQRT            : 'sqrt';
SIN             : 'sin';
COS             : 'cos';
ASIN            : 'asin';
ACOS            : 'acos';

PI              : 'PI';
GOLDEN_RATIO    : 'GOLDEN_RATIO';
    

//Integer Literals

IntegerLiteral
	:	DecimalIntegerLiteral
	|	HexIntegerLiteral
	|	OctalIntegerLiteral
	|	BinaryIntegerLiteral
	;

fragment
DecimalIntegerLiteral
	:	DecimalNumeral IntegerTypeSuffix?
	;

fragment
HexIntegerLiteral
	:	HexNumeral IntegerTypeSuffix?
	;

fragment
OctalIntegerLiteral
	:	OctalNumeral IntegerTypeSuffix?
	;

fragment
BinaryIntegerLiteral
	:	BinaryNumeral IntegerTypeSuffix?
	;

fragment
IntegerTypeSuffix
	:	[lL]
	;

fragment
DecimalNumeral
	:	'0'
	|	NonZeroDigit (Digits? | Underscores Digits)
	;

fragment
Digits
	:	Digit (DigitsAndUnderscores? Digit)?
	;

fragment
Digit
	:	'0'
	|	NonZeroDigit
	;

fragment
NonZeroDigit
	:	[1-9]
	;

fragment
DigitsAndUnderscores
	:	DigitOrUnderscore+
	;

fragment
DigitOrUnderscore
	:	Digit
	|	'_'
	;

fragment
Underscores
	:	'_'+
	;

fragment
HexNumeral
	:	'0' [xX] HexDigits
	;

fragment
HexDigits
	:	HexDigit (HexDigitsAndUnderscores? HexDigit)?
	;

fragment
HexDigit
	:	[0-9a-fA-F]
	;

fragment
HexDigitsAndUnderscores
	:	HexDigitOrUnderscore+
	;

fragment
HexDigitOrUnderscore
	:	HexDigit
	|	'_'
	;

fragment
OctalNumeral
	:	'0' Underscores? OctalDigits
	;

fragment
OctalDigits
	:	OctalDigit (OctalDigitsAndUnderscores? OctalDigit)?
	;

fragment
OctalDigit
	:	[0-7]
	;

fragment
OctalDigitsAndUnderscores
	:	OctalDigitOrUnderscore+
	;

fragment
OctalDigitOrUnderscore
	:	OctalDigit
	|	'_'
	;

fragment
BinaryNumeral
	:	'0' [bB] BinaryDigits
	;

fragment
BinaryDigits
	:	BinaryDigit (BinaryDigitsAndUnderscores? BinaryDigit)?
	;

fragment
BinaryDigit
	:	[01]
	;

fragment
BinaryDigitsAndUnderscores
	:	BinaryDigitOrUnderscore+
	;

fragment
BinaryDigitOrUnderscore
	:	BinaryDigit
	|	'_'
	;

//Floating-Point Literals

FloatingPointLiteral
	:	DecimalFloatingPointLiteral
	|	HexadecimalFloatingPointLiteral
	;

fragment
DecimalFloatingPointLiteral
	:	Digits '.' Digits? ExponentPart? FloatTypeSuffix?
	|	'.' Digits ExponentPart? FloatTypeSuffix?
	|	Digits ExponentPart FloatTypeSuffix?
	|	Digits FloatTypeSuffix
	;

fragment
ExponentPart
	:	ExponentIndicator SignedInteger
	;

fragment
ExponentIndicator
	:	[eE]
	;

fragment
SignedInteger
	:	Sign? Digits
	;

fragment
Sign
	:	[+-]
	;

fragment
FloatTypeSuffix
	:	[fFdD]
	;

fragment
HexadecimalFloatingPointLiteral
	:	HexSignificand BinaryExponent FloatTypeSuffix?
	;

fragment
HexSignificand
	:	HexNumeral '.'?
	|	'0' [xX] HexDigits? '.' HexDigits
	;

fragment
BinaryExponent
	:	BinaryExponentIndicator SignedInteger
	;

fragment
BinaryExponentIndicator
	:	[pP]
	;

LPAREN          : '(';
RPAREN          : ')';
LBRACE          : '{';
RBRACE          : '}';
LBRACK          : '[';
RBRACK          : ']';
SEMI            : ';';
COMMA           : ',';
DOT             : '.';

EQUALS          : '=';
ASSIGN          : ':=';
ADD             : '+';
SUB             : '-';
MUL             : '*';
DIV             : '/';

symbols
    : Symbol ( COMMA Symbol )*
    ;

Symbol : LETTER LETTER_OR_NUMBER* ;

fragment
LETTER          : [a-zA-Z$_];

fragment
LETTER_OR_NUMBER : [a-zA-Z0-9$_];

WS  :  [ \t\r\n\u000C]+ -> skip
    ;

LINE_COMMENT
    :   '#' ~[\r\n]* -> skip
    ;