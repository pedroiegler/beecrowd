var input = require('fs').readFileSync('stdin', 'utf8');
var linhas = input.split('\n');

var i, j, x, n, soma;

x = parseInt(linhas.shift());

for(i = 0; i < x; i++){
    soma = 0;
    n = parseInt(linhas.shift());

    for(j = 1; j < n; j++){
        if(n % j == 0){
            soma += j;
        }
    }

    if(soma == n){
        console.log(n + " eh perfeito");
    } else{
        console.log(n + " nao eh perfeito");
    }

}
