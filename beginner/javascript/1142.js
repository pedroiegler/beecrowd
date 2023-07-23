const input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split('\n');
var n = parseInt(valores.shift());
var x = 1, i;

for(i = 0; i < n; i++){
    console.log(`${x} ${x+1} ${x+2} PUM`);
    x = x + 4;
}