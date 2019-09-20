// Lenguaje SEMANTICO en SimpleCustomVisitor.java
//################################################ SINTACTICO ##########################################################################
grammar Simple;


//s 		: operation EOF					
//		;

program	: start_block segments*	end_block;

segments	: declaration
			| assignation
			| block_logic
			| while_loop
			| for_loop;

declaration		: type_date ID
				| type_date assignation;

assignation		: ID ASSIG date
				| ID ASSIG operation;

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

operation	: LPAR operation RPAR
			| operation SUM operation
			| operation REST operation
			| operation MULT operation
			| operation DIV operation
			| date;

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


// For

for_loop	: start_for segments* end_for;

rango		: LPAR assignation POINT condition POINT assignation RPAR;

start_for	: FOR rango LKEY;
end_for		: RKEY ENDFR;

// Lectura y escritura



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
POINT	: ',';

// Operadores Matematicos

SUM		: '+';
REST	: '-';
MULT	: '*';
DIV		: '/';



ID		: [a-zA-Z]+						;
COMMENT	:  '!' .*? '\r'? '\n' -> skip	;
WS 		: [ \t\r\n]+ -> skip 			;