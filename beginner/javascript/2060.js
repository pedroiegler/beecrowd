var input = require("fs").readFileSync("stdin", "utf8");
var lines = input.split("\n");

var i, n, value, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;

n = parseInt(lines.shift())
value = lines.shift().split(" ");

for(i = 0; i < n; i++){

    if(value[i] % 2 == 0)
        cont2++;
    if(value[i] % 3 == 0)
        cont3++;
    if(value[i] % 4 == 0)
        cont4++;
    if(value[i] % 5 == 0)
        cont5++;
}

console.log(cont2 + " Multiplo(s) de 2");
console.log(cont3 + " Multiplo(s) de 3");
console.log(cont4 + " Multiplo(s) de 4");
console.log(cont5 + " Multiplo(s) de 5");