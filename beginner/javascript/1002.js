var input = require('fs').readFileSync('stdin', 'utf8');

var values = input.split('\n');

var raio = parseFloat(values.shift());
var pi = 3.14159;

var area = pi * Math.pow(raio,2);

console.log("A="+area.toFixed(4));

