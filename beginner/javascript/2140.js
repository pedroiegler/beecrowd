var input = require("fs").readFileSync("stdin", "utf8");
var lines = input.split("\n");

var troco = [7, 12, 22, 52, 102, 15, 25, 55, 105, 30, 60, 110, 70, 120, 150, 4, 10, 20, 40, 100, 200];
var possivel = 0;
var n, m, valor, i;

while(true){
    var valores = lines.shift().split(" ");
    n = parseInt(valores[0]);
    m = parseInt(valores[1]);

    if(n == 0 && m == 0)
        break;
    else{
        valor = m - n;

        for(i = 0; i < 21; i++){
            if(valor == troco[i])
                possivel = 1;
        }

        if(possivel == 1){
            console.log("possible");
            possivel = 0;
        }
        else
            console.log("impossible");
    }
}
