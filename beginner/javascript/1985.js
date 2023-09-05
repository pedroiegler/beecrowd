let input = require('fs').readFileSync('stdin', 'utf-8').split('\n');

var i, n, index;
var value, soma = 0;

n = parseInt(input[0]);

for(i = 1; i <= n; i++){
    var valores = input[i].split(" ");

    index = parseInt(valores[0]);
    value = parseFloat(valores[1]);

    if(index == 1001){
        value *= 1.50;
        soma += value;
    } else if(index == 1002){
        value *= 2.50;
        soma += value;
    } else if(index == 1003){
        value *= 3.50;
        soma += value;
    } else if(index == 1004){
        value *= 4.50;
        soma += value;
    } else if(index == 1005){
        value *= 5.50;
        soma += value;
    }
}

console.log(soma.toFixed(2));