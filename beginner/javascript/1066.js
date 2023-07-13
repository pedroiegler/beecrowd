var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split('\n');
var n, i, contPar = 0, contImpar = 0, contPos = 0, contNeg = 0;

for(i = 0; i < 5; i++){
    n = parseInt(valores.shift());
    if(n > 0)
        contPos+=1;
    if(n < 0)
        contNeg+=1;
    if(n % 2 == 0)
        contPar+=1;
    if(n % 2 != 0)
        contImpar+=1;
}

console.log(contPar + " valor(es) par(es)");
console.log(contImpar + " valor(es) impar(es)");
console.log(contPos + " valor(es) positivo(s)");
console.log(contNeg + " valor(es) negativo(s)");