var input = require("fs").readFileSync("stdin", "utf8");
var lines = input.split("\n");

var n, m, i, s;

var valores = lines[0].split(" ");

n = parseInt(valores[0]);
m = parseInt(valores[1]);

for(i = 1; i <= m; i++){
    s = lines.shift();

    if(s == "fechou")
        n+=1;
    else
        n-=1;
}
 
console.log(n);