var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split("\n");

var x = parseInt(valores.shift());
var y = parseFloat(valores.shift());

var n = x / y;

console.log(n.toFixed(3) + " km/l");