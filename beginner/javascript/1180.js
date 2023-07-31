var input = require('fs').readFileSync('stdin', 'utf8');
var linhas = input.split('\n');

var n = parseInt(linhas.shift());
var v = linhas.shift().split(" ").map(valor => parseInt(valor));

var menor = v[0];
var posicao = 0;

for (var i = 0; i < n; i++) {
    if (v[i] < menor) {
        menor = v[i];
        posicao = i;
    }
}

console.log(`Menor valor: ${menor}`);
console.log(`Posicao: ${posicao}`);
