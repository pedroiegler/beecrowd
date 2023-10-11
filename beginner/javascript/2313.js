var input = require("fs").readFileSync("stdin", "utf8");
var lines = input.split(" ");

var a, b, c;

a = parseInt(lines[0]);
b = parseInt(lines[1]);
c = parseInt(lines[2]);

if(b + c > a && a + c > b && a + b > c){
    if (a == b && b == c) {
        console.log("Valido-Equilatero");
    } else if (a == b || b == c || a == c) {
        console.log("Valido-Isoceles");
    } else {
        console.log("Valido-Escaleno");
    }

    if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
        console.log("Retangulo: S");
    } else {
        console.log("Retangulo: N");
    }
}
else{
    console.log("Invalido");
}