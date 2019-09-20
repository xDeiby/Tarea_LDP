//grammar Simple;

//r  : 'hello' ID ;         // match keyword hello followed by an identifier

//ID : [a-z]+ ;             // match lower-case identifiers

//WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

grammar Simple;


//s 		: operation EOF					
//		;

program	: start_block segments*	end_block;

segments:	  declaration
			| assignation
			| block_logic
			| while_loop;

declaration		: type_date ID
				| type_date ID ASSIG date;

assignation	: ID ASSIG date;

date	: NUMBER
		| FLOTANTE
		| BOOL
		| ID;

type_date	: INT
			| FLOAT
			| BOOL;
			
if_block: IF condition ;
			

start_block : START;

end_block	: END;

condition	: LPAR condition RPAR
			| condition AND condition
			| condition OR condition
			| condition DIST condition
			| condition IGUAL condition
			| condition MAY condition
			| condition MEN condition
			| date;

// if, else if, else
block_logic	: (start_if | start_else) segments* end_if ;

start_if	: IF_CON condition LKEY;

start_else	: ELSE LKEY;

end_if		: RKEY;

// while
while_loop	: start_wh segments* end_wh;

start_wh	: WHILE condition LKEY;

end_wh		: RKEY ENDWH;



// ############################################################# LEXICO #################################################################
//Estructura general
START: 'inicio';
END: 'fin';

fragment TRUE		: 'v'		;
fragment FALSE		: 'f'		;
fragment NUM		: [0-9]		;
fragment DOT		: '.'		;
fragment IF			: 'si'		;
fragment ELIF		: 'sino_si'	;

//Tipos de datos
INT		: 'entero'	;
FLOAT	: 'real'		;
BOOL	: 'logico'	;

//Definicion de datos
NUMBER		: NUM+				;
FLOTANTE 	: NUMBER DOT NUMBER	;
BOOLEAN 	: TRUE | FALSE		;

//Asignacion
ASSIG:	'<-';

//Estructuras Logicas
IF_CON	: IF | ELIF;
ELSE	: 'sino';
ENDIF	: 'fin_si';

//Parentesis/Corchetes
LPAR : '(';
RPAR : ')';
LKEY : '{';
RKEY : '}';

//Operadores Logicos
AND		: 'and';
OR		: 'or';

//Comparadores
DIST	: '<>';
IGUAL	: '=';
MAY		: '>';
MEN		: '<';

//Estructuras Repetitivas
WHILE	: 'mientras';
ENDWH	: 'fin_mientras';
FOR		: 'para';
ENDFR	: 'fin_para';



ID		: [a-zA-Z]+						;
COMMENT	:  '!' .*? '\r'? '\n' -> skip	;
WS 		: [ \t\r\n]+ -> skip 			;