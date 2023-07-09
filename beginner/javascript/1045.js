var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split(' ');

var a = parseFloat(valores.shift());
var b = parseFloat(valores.shift());
var c = parseFloat(valores.shift());

var temp;

if(a < b){
    temp = a;
    a = b;
    b = temp;
} 
if(a < c){
    temp = a;
    a = c;
    c = temp;
}
if(b < c){
    temp = b;
    b = c;
    c = temp;
}

powA = Math.pow(a,2);
powB = Math.pow(b,2);
powC = Math.pow(c,2);

if(a >= (b+c) || b >= (a+c) || c >= (a+b))
    console.log("NAO FORMA TRIANGULO");
else if(powA == (powB + powC) || powB == (powA + powC) || powC == (powA + powB))
    console.log("TRIANGULO RETANGULO");
else if(powA > (powB + powC) || powB > (powA + powC) || powC > (powA + powB))
    console.log("TRIANGULO OBTUSANGULO");
else if(powA < (powB + powC) || powB < (powA + powC) || powC < (powA + powB))
    console.log("TRIANGULO ACUTANGULO");
if(a == b && a == c)
    console.log("TRIANGULO EQUILATERO");
if((a == b && a != c)  || (a == c && a != b) || (b == c && b != a))
    console.log("TRIANGULO ISOSCELES");

