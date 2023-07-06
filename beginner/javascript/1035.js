var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split(" ");

var a = parseInt(valores[0]);
var b = parseInt(valores[1]);
var c = parseInt(valores[2]);
var d = parseInt(valores[3]);

if(b > c && d > a && (c+d) > (a+b) && c > 0 && d > 0 && a % 2 == 0){
    console.log("Valores aceitos");
} else{
    console.log("Valores nao aceitos");
}