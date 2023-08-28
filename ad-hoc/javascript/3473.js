var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split(' ');
var n;
    
n = parseInt(lines.shift());

console.log(n+1);