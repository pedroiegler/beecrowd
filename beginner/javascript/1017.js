var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split("\n");

var n1 = parseInt(valores[0]);
var n2 = parseInt(valores[1]);

var n3 = (n1 * n2) / 12.0;

console.log(n3.toFixed(3));
