var input = require('fs').readFileSync('stdin', 'utf8');

var a, b, i, n;

var linhas = input.split('\n');

n = parseInt(linhas[0]);

for(i = 1; i <= n; i++){
    var valores = linhas[i].split(' ');
    a = parseInt(valores[0]);
    b = parseInt(valores[1]);

    console.log(a+b);
}