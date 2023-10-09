var input = require("fs").readFileSync("stdin", "utf8");
var lines = input.split("\n");

var a, b, c;

var valores = lines.shift().split(" ");
        
a = parseInt(valores[0]);
b = parseInt(valores[1]);
c = parseInt(valores[2]);

if (a != b + c && b != a + c && c != a + b && a != b && a != c && b != c)
    console.log("N");
else
    console.log("S");