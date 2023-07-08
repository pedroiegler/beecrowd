var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split(' ');

var a = parseFloat(valores.shift());
var b = parseFloat(valores.shift());
var c = parseFloat(valores.shift());

var perimetro = a + b + c;
var area = (a + b) * c / 2;

if((a < (b + c)) && (b < (a + c)) && (c < (a + b))){
    console.log("Perimetro = " + perimetro.toFixed(1));
} else{
    console.log("Area = " + area.toFixed(1));
}