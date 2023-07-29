var input = require('fs').readFileSync('stdin', 'utf8');
var linhas = input.split('\n');

var n = [];
var a, v;
v = parseInt(linhas.shift());

for(a = 0; a < 10; a++){
    n[a] = v;
    console.log(`N[${a}] = ${v}`);
    v *= 2;
}
