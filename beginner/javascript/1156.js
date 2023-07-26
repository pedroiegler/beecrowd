var input = require('fs').readFileSync('stdin', 'utf8');
var valores = input.split('\n');

var i, x = 1, s = 0.0;

for (i = 1; i <= 39; i += 2){
    s = s + (i / x);
    x *= 2; 
}

console.log(s.toFixed(2));