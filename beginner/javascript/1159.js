var input = require('fs').readFileSync('stdin', 'utf8');
var linhas = input.split('\n');

var x, soma, cont;

while (true) {
    soma = 0;
    cont = 0;
    x = parseInt(linhas.shift());

    if (x == 0)
        break;

    while (cont < 5) {
        if (x % 2 == 0) {
            soma += x;
            cont++;
        }
        x++;
    }

    console.log(soma);
}