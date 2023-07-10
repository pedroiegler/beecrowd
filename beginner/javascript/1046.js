var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split(' ');

var horaIni = parseInt(valores.shift());
var horaFin = parseInt(valores.shift());
var cont = 0;

for(;;){
    horaIni++;
    cont++;
    if(horaIni == 24){
        horaIni = 0;
    }
    if(horaIni == horaFin){
        break;
    }
}

console.log("O JOGO DUROU " + cont + " HORA(S)");