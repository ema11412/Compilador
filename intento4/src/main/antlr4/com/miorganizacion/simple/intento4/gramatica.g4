grammar gramatica;

program
:
	identificador+
	main
	proceso*
;
identificador: 
	var_dec | var_asig | var_decasign
;
main:
	BEGIN
	accion*
	END
;
proceso:
	PROC ID
	accion*
	EPROC
;
var_dec: 
	VAR ID SEMICOLON
;

var_asig: 
	SET ID ASSIGN (ID | NUMBER) SEMICOLON
;

var_decasign: 
	VAR ID ASSIGN (ID | NUMBER) SEMICOLON
;
accion: 
	idp | idl | change | placeM | place | highM | high | put | posstart | callname | posi | keep | forr | when
;
when: 
	WHEN ID ASSIGN (ID | NUMBER) THEN
	accion*
	WHEND
;
forr: 
	FOR ID ASSIGN (ID | NUMBER) TIMES
	accion*
	FEND
;
keep: 
	KEEP
	accion*
	SKIPS
	accion*
	KEND SEMICOLON
;
posi: 
	POSI PARI ID COMA ID PARF SEMICOLON
;	
callname: 
	CALL ID
;
posstart: 
	POSSTART PARI ID COMA ID PARF SEMICOLON
;
put: 
	PUT LIGHT SEMICOLON
;
high:
	HIGH BLOCKM SEMICOLON
;
highM: 
	HIGH BLOCKM (ID | NUMBER) SEMICOLON
;
place:
	PLACEM BLOCKM SEMICOLON
;	
placeM: 
	PLACE BLOCK (ID | NUMBER) SEMICOLON
;
change: 
	CHANGEDIR PARI (RIGHT | LEFT | BACK | SAME) PARF
;
idl: 
	LESS ID SEMICOLON
;

idp: 
	ADD ID SEMICOLON
;

WS: [ \t\r\n]+ -> skip;

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
POSI: 'Pos';
KEEP: 'Keep';
SKIPS: 'Skip';
KEND: 'Kend';
FOR: 'For';
FEND: 'FEnd';
TIMES: 'Times';
WHEN: 'When';
WHEND:'Whend';
THEN: 'Then';
POSSTART: 'PosStart';
CALL: 'Call';
ADD: 'Add+';
LESS: 'Less+';
LEFT: 'LEFT';
RIGHT: 'RIGHT';
BACK: 'BACK';
SAME: 'SAME';

ASSIGN: '=';
PARI: '(';
PARF: ')';
COMA: ',';
SEMICOLON: ';';


NUMBER: [0-9]+;
ID: [a-z][a-zA-Z0-9_@*]?[a-zA-Z0-9_@*]?[a-zA-Z0-9_@*]?[a-zA-Z0-9_@*]?[a-zA-Z0-9_@*]?[a-zA-Z0-9_@*]?[a-zA-Z0-9_@*]?[a-zA-Z0-9_@*]?[a-zA-Z0-9_@*]?;