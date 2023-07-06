var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split(' ');

var a = parseFloat(valores.shift());
var b = parseFloat(valores.shift());
var c = parseFloat(valores.shift());

var delta = Math.pow(b,2) - 4 * a * c;

if(a == 0 || delta < 0){
    console.log("Impossivel calcular");
} else{
    var R1 = (-b + Math.sqrt(delta)) / (2 * a);
    var R2 = (-b - Math.sqrt(delta)) / (2 * a);
    console.log("R1 = " + R1.toFixed(5));
    console.log("R2 = " + R2.toFixed(5));
}