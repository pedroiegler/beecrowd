var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split('\n');
var tempo = parseInt(valores[0]);

var hora = parseInt(tempo / 3600);
var resto = tempo % 3600;

var minutos = parseInt(resto / 60);
var segundos = parseInt(resto % 60);

console.log(hora + ":" + minutos + ":" + segundos);