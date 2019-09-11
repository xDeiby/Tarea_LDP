//grammar Simple;

//r  : 'hello' ID ;         // match keyword hello followed by an identifier

//ID : [a-z]+ ;             // match lower-case identifiers

//WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

grammar Simple;

//############################################################## ANALIZADOR SINTACTICO #####################################################################################

program	: START sentences* END;

sentences: 	  decla 
			| assign_var
			| sent_logic
			| for_loop
			| while_loop
			| read_op
			| writte_op;
			
type_data:    INT 
			| FLOAT 
			| BOOL;

date:     NUMBER 
		| FLOTANTE 
		| BOOLEANO
		| ID;

decla:    type_data ID 
		| type_data ID ASSIG operation;

assign_var	: ID ASSIG operation;

operation: 	  operation SUM operation
			| operation REST operation
			| operation MULT operation
			| operation DIV operation
			| PAR_L operation PAR_R
			| date;

sent_logic: IF condition KEY_L sentences* KEY_R 
			(ELIF condition KEY_L sentences* KEY_R)* 
			(ELSE condition KEY_L sentences* KEY_R)?
			ENDIF;



condition: 	  condition MAY_Q condition
			| condition MEN_Q condition
			| condition IGUAL condition
			| condition AND condition
			| condition OR condition
			| PAR_L condition PAR_R
			| date;
			
while_loop	: WHILE condition KEY_L sentences* KEY_R ENDWH;

for_loop	: FOR PAR_L decla DELIM date DELIM date PAR_R KEY_L sentences* KEY_R ENDFOR;

writte_op	: WRITTE PAR_L (operation | condition) PAR_R;

read_op		: READ PAR_L ID* PAR_R;
			
//#####################################################################################################################################################################

//############################################################## ANALIZADOR LEXICO #####################################################################################

START	: 'inicio';
END		: 'fin';

//Operaciones matematicas
SUM		: '+';
REST	: '-';
MULT	: '*';
DIV		: '/';

//RANGOS DATOS
fragment FALSE	: 'false';
fragment TRUE	: 'true';
fragment NUMBER	: [0,9];
fragment DOT	: '.';

FLOTANTE	: NUMBER DOT NUMBER;
BOOLEANO	: TRUE | FALSE;


//Tipos de variables
INT		: 'entero';
FLOAT	: 'real';
BOOL	: 'logico';

//Asignacion
ASSIG	: '<-';

//Operadores Logicos
MAY_Q	: '>';
MEN_Q	: '<';
IGUAL	: '=';

AND		: 'and';
OR		: 'or';

//LLaves y parentesis
PAR_L	: '(';
PAR_R	: ')';

KEY_L	: '{';
KEY_R	: '{';

//Estructuras Logicas
IF		: 'si';
ELSE	: 'sino';
ELIF	: 'sino_si';
ENDIF	: 'fin_si';

//Estructuras repetitivas
FOR		: 'para';
ENDFOR	: 'fin_para';
DELIM	: ';';    //Delimitador de datos: para(x<-0;6;1) (inicial,limite,aumento)

WHILE	: 'mientras';
ENDWH	: 'fin_mientras';

//Lectura y Escritura
READ	: 'leer';
WRITTE	: 'escribir';


ID		: [a-zA-Z]+						;
COMMENT	:  '!' .*? '\r'? '\n' -> skip	;
WS 		: [ \t\r\n]+ -> skip 			;

//############################################################## ANALIZADOR LEXICO #####################################################################################
