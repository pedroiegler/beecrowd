var input = require('fs').readFileSync('stdin', 'utf8');

var values = input.split('\n');

var nota1 = parseFloat(values.shift());
var nota2 = parseFloat(values.shift());
var nota3 = parseFloat(values.shift());

var media = ((nota1 * 2.0) + (nota2 * 3.0) + (nota3 * 5.0)) / 10;

console.log("MEDIA = " + media.toFixed(1));
