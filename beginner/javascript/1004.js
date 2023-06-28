var input = require('fs').readFileSync('stdin', 'utf8');

var values = input.split('\n');

var a = parseInt(values.shift());
var b = parseInt(values.shift());

console.log("PROD = " + (a*b));
