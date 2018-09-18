grammar Simple;

program:
	sentence
	main
	process
;
main:
	BEGIN 
		 
	END	
;
sentence: 
	var_decl | var_assign
;
var_decl:
	VAR ID SEMICOLON
;
var_assign:
	VAR ID ASSIGN NUMBER SEMICOLON
;
process:
	PROC ID
	EPROC
;

BEGIN: 'Begin';
END: 'End';
PROC: 'Proc';
EPROC: 'End-Proc';
VAR: 'Var';
SET: 'Set';

CHANGEDIR: 'ChangeDir';
PLACE: 'place';
PLACEM: 'Place';
BLOCK: 'block';
BLOCKM: 'Block';
HIGH: 'High';
PUT: 'Put';
LIGHT: 'Light';
POS: 'Pos';
KEEP: 'Keep';
KEND: 'Kend';
SKIP: 'Skip';
FOR: 'For';
FEND: 'FEnd';
TIMES: 'Times';
WHEN: 'When';
WHEND: 'Whend';
THEN: 'Then';
POSSTART: 'PosStart';
CALL: 'Call';

PLUS: '+';
MINUS: '-';
MULT: '/';
DIV: '*';

ASSIGN: '=';
COMA: ',';
SEMICOLON: ';';

ID: [a-z][a-zA-Z0-9_@*]*;

NUMBER: [0-9]+;

WS
:
	[ \t\r\n]+ -> skip
;