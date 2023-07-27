var input = require('fs').readFileSync('stdin', 'utf8');
var linhas = input.split('\n');

var i, valores, n, cont = 0, soma;

n = parseInt(linhas.shift());

for (i = 0; i < n; i++) {
    soma = 0;
    valores = linhas.shift().split(" ");
    var x = parseInt(valores[0]);
    var y = parseInt(valores[1]);

    while (cont < y) {
        if (x % 2 !== 0) {
            soma += x;
            cont++;
        }
        x++;
    }

    console.log(soma);
    cont = 0; 
}
