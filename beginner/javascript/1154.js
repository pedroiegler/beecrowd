var input = require('fs').readFileSync('stdin', 'utf8');
var valores = input.split('\n');

var idade, soma = 0, total = 0, media;

for(;;){
    idade = parseInt(valores.shift());
    if(idade >= 0){
        soma += idade;
        total++;
    }else{
        break;
    }
}

media = soma / total;

console.log(`${media.toFixed(2)}`);