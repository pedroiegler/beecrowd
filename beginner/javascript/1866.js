var input = require('fs').readFileSync('stdin', 'utf8').split('\n');

var i, j, n, cont = 1, v, soma;

n = parseInt(input.shift());

for(i = 0; i < n; i++){

    soma = 0;

    v = parseInt(input.shift());

    for(j = 1; j <= v; j++){
        if(j % 2 != 0){
            soma += cont;
        } else{
            soma -= cont;
        }
    }

    console.log(soma);
}