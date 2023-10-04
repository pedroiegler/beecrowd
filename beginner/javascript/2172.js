var input = require("fs").readFileSync("stdin", "utf8");
var lines = input.split("\n");

var n1, n2;

while(true){
    var valores = lines.shift().split(" ");
    n1 = parseInt(valores[0]);
    n2 = parseInt(valores[1]);

    if(n1 == 0 & n2 == 0)
        break;
    else
        console.log(n1*n2);
}