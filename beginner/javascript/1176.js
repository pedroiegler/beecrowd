var input = require('fs').readFileSync('stdin', 'utf8');
var linhas = input.split('\n');

var i, primeiro = 0, segundo = 1, prox = 0, n, c;
var j = parseInt(linhas.shift());

for (i = 1; i <= j; i++, primeiro = 0, segundo = 1){
    n = parseInt(linhas.shift());
    n = n + 1;

    for (c = 0; c < n; c++) {
        if (c <= 1)
            prox = c;
        else {
            prox = primeiro + segundo;
            primeiro = segundo;
            segundo = prox;
        }
    }

    console.log(`Fib(${n - 1}) = ${prox}`);
}