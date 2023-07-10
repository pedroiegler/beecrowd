var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split(' ');

var horaIni = parseInt(valores.shift());
var minIni = parseInt(valores.shift());
var horaFim = parseInt(valores.shift());
var minFim = parseInt(valores.shift());
var dif;

dif = ((horaFim * 60) + minFim) - ((horaIni * 60) + minIni);

if(dif <= 0) 
    dif += 24 * 60;

console.log("O JOGO DUROU " + parseInt(dif/60) + " HORA(S) E " + parseInt(dif%60) + " MINUTO(S)");    