var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split('\n');

var x = parseInt(valores.shift());
var y = parseInt(valores.shift());

var soma = 0, menor = 0, maior = 0, i;

if(x < y){
    menor = x;
    maior = y;
} 
if(y < x){
    menor = y;
    maior = x;
}

if(menor % 2 != 0){
    for(i = menor+1; i < maior; i++){
        if(i % 2 != 0){
            soma = soma + i;
        }
    }
}
else{
    for(i = menor; i < maior; i++){
        if(i % 2 != 0){
            soma = soma + i;
        }
    }
}

console.log(soma);