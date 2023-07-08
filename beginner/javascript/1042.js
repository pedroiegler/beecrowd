var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split(' ');

var a = parseInt(valores.shift());
var b = parseInt(valores.shift());
var c = parseInt(valores.shift());

var x = a;
var y = b;
var z = c;
var aux;

if(x > y){
    aux = x;
    x = y;
    y = aux;
} 
if(x > z){
    aux = x;
    x = z;
    z = aux;
} 
if(y > z){
    aux = y;
    y = z;
    z = aux;
}

console.log(x + "\n" + y + "\n" + z);
console.log("\n" + a + "\n" + b + "\n" + c);