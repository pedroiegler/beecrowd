var fs = require("fs");
var input = fs.readFileSync("stdin", "utf8");
var lines = input.split("\n");

var i, n, n1, n2;

n = parseInt(lines.shift());

for(i = 0; i < n; i++){
    var valores = lines.shift().split(" ");
    n1 = parseInt(valores[0]);
    n2 = parseInt(valores[1]);

    var soma = 0;
    soma = n1 + n2;

    switch (soma){
        case 0: console.log("PROXYCITY"); break;
        case 1: console.log("P.Y.N.G."); break;
        case 2: console.log("DNSUEY!"); break;
        case 3: console.log("SERVERS"); break;
        case 4: console.log("HOST!"); break;
        case 5: console.log("CRIPTONIZE"); break;
        case 6: console.log("OFFLINE DAY"); break;
        case 7: console.log("SALT"); break;
        case 8: console.log("ANSWER!"); break;
        case 9: console.log("RAR?"); break;
        case 10: console.log("WIFI ANTENNAS"); break;
        default: break;
    }
}