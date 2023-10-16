var fs = require("fs");
var input = fs.readFileSync("stdin", "utf8");
var lines = input.split("\n");

var n, i, pergunta;

n = parseInt(lines.shift());

for(i = 0; i < n; i++){
    pergunta = lines.shift();

    console.log("I am Toorg!");
}
