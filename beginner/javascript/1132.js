const input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split('\n');
var x = 0, y = 0, i, menor, maior, soma = 0;

x = parseInt(valores.shift());
y = parseInt(valores.shift());

if(x < y){
    menor = x;
    maior = y;
} else{
    menor = y;
    maior = x;
}

for(i = menor; i <= maior; i++){
    if(i % 13 != 0)
        soma+=i;
}

console.log(soma);