var input = require('fs').readFileSync('stdin', 'utf8');

var linhas = input.split('\n');

var a = parseInt(linhas.shift());

var ara = [];

var valores = linhas[0].split(" ");
for (var b = 0; b < a; b++) {
    ara[b] = parseInt(valores[b]);
}

var c = ara[0];
var e = 1;

for (var d = 0; d < a; d++) {
    if (ara[d] < c) {
        c = ara[d];
        e = d + 1;
    }
}

console.log(e);
