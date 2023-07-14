var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split('\n');

var i, n, x, contIn = 0, contOut = 0;

n = parseInt(valores.shift());

for(i = 0; i < n; i++){
    x = parseInt(valores.shift());

    if(x >= 10 && x <= 20){
        contIn++;
    } else{
        contOut++;
    }
}

console.log(contIn + " in");
console.log(contOut + " out");