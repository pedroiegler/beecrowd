var input = require("fs").readFileSync("stdin", "utf8");
var lines = input.split("\n");

var casos, palavra, resultado = 0.01;

casos = parseInt(lines.shift());

while (casos!=0){

    palavra = lines.shift();

    console.log(((palavra.length)*resultado).toFixed(2));

    casos--;
}