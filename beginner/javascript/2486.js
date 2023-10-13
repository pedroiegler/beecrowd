var fs = require("fs");
var input = fs.readFileSync("stdin", "utf8");
var lines = input.split("\n");

var n, i, nf, soma, nomeFruta;

while (true) {
    soma = 0;
    n = parseInt(lines.shift());
    if (n === 0)
        break;

    for (i = 0; i < n; i++) {
        var valores = lines.shift().split(" ");
        nf = parseInt(valores[0]);
        nomeFruta = valores.slice(1).join(" "); 

        var qtd;

        if (nomeFruta == "suco de laranja") {
            qtd = 120;
        } else if (nomeFruta == "morango fresco") {
            qtd = 85;
        } else if (nomeFruta == "mamao") {
            qtd = 85;
        } else if (nomeFruta == "goiaba vermelha") {
            qtd = 70;
        } else if (nomeFruta == "manga") {
            qtd = 56;
        } else if (nomeFruta == "laranja") {
            qtd = 50;
        } else if (nomeFruta == "brocolis") {
            qtd = 34;
        }

        soma += nf * qtd;
    }

    if (soma >= 110 && soma <= 130) {
        console.log(soma + " mg");
    } else if (soma > 130) {
        console.log("Menos " + (soma - 130) + " mg");
    } else if (soma < 110) {
        console.log("Mais " + (110 - soma) + " mg");
    }
}
