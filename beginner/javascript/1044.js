var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split(' ');

var a = parseInt(valores.shift());
var b = parseInt(valores.shift());

if(b % a == 0 || a % b == 0){
    console.log("Sao Multiplos");
} else{
    console.log("Nao sao Multiplos");
}
