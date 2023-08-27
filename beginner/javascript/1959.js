var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split(' ');
var a, b, r;
        
a = parseInt(lines[0]);
b = parseInt(lines[1]);

r = a * b;

console.log(r);