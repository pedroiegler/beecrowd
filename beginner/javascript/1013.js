var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split(" ");

var a = parseInt(valores[0]);
var b = parseInt(valores[1]);
var c = parseInt(valores[2]);

if(a > b && a > c){
    console.log("%d eh o maior", a);
} else if(b > c){
    console.log("%d eh o maior", b);
} else{
    console.log("%d eh o maior", c);
}