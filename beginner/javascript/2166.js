var fs = require("fs");
var input = fs.readFileSync("stdin", "utf8");
var lines = input.split("\n");

var n,raiz = 0.0;

n = parseInt(lines.shift());
while(n--){
    raiz+=2.0;
    raiz = 1/raiz;
}
raiz += 1.0;
console.log(raiz.toFixed(10));