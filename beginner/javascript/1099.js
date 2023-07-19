var input = require('fs').readFileSync('stdin', 'utf8');

var linhas = input.split('\n');
var i, j, n, n1, n2, soma, maior = 0, menor = 0;

n = parseInt(linhas[0]);

for(i = 1; i <= n; i++){
    soma = 0;
    var valores = linhas[i].split(' ').map(parseFloat);

    if(valores[0] < valores[1]){
        menor = valores[0]+1;
        maior = valores[1];
    } else{
        menor = valores[1]+1;
        maior = valores[0];
    }

    for(j = menor; j < maior; j++){
        if(j % 2 != 0){
            soma += j;
        }
    }

    console.log(soma);
}