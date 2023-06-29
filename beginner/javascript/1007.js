var input = require('fs').readFileSync('stdin', 'utf8');

var values = input.split('\n');

var a = parseInt(values.shift());
var b = parseInt(values.shift());
var c = parseInt(values.shift());
var d = parseInt(values.shift());

var dif = a * b - c * d;

console.log("DIFERENCA = " + dif);

