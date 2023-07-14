var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split('\n');

var i, quadrado;

var n = parseInt(valores.shift());


for(i = 1; i <= n; i++){
    if(i % 2 == 0){
        quadrado = Math.pow(i,2);
        console.log(i + "^2 = " + quadrado);
    }
}