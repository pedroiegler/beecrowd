var input = require("fs").readFileSync("stdin", "utf8");
var lines = input.split("\n");

var n = parseInt(lines.shift());

for(var i = 0; i < n; i++){
    var j1 = lines.shift();
    var j2 = lines.shift();

    if (j1 == "ataque" &&j2 == "ataque")
        console.log("Aniquilacao mutua")
    else if (j1 == "pedra" && j2 == "pedra")
        console.log("Sem ganhador")
    else if (j1 == "papel" && j2 == "papel")
        console.log("Ambos venceram")
    else if (j1 == "ataque" && j2 == "pedra")
        console.log("Jogador 1 venceu")
    else if (j1 == "pedra" && j2 == "ataque")
        console.log("Jogador 2 venceu")
    else if (j1 == "pedra" && j2 == "papel")
        console.log("Jogador 1 venceu")
    else if (j1 == "papel" && j2 == "pedra")
        console.log("Jogador 2 venceu")
    else if (j1 == "ataque" && j2 == "papel")
        console.log("Jogador 1 venceu")
    else if (j1 == "papel" && j2 == "ataque")
        console.log("Jogador 2 venceu")

}