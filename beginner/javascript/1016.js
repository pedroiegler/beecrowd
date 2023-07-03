var input = require('fs').readFileSync('/dev/stdin', 'utf8');

var valores = input.split("\n");

var n = parseInt(valores[0]);

var x = n * 2;

console.log(x + " minutos");