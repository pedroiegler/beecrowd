var input = require('fs').readFileSync('stdin', 'utf8');

var values = input.split('\n');

var A = parseInt(values.shift());
var B = parseInt(values.shift());

var X = A + B;

console.log("SOMA = " + X);