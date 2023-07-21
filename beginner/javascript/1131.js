const input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split('\n');
var resposta = 1, qtdGrenais = 0, vitoriaInter = 0, vitoriaGremio = 0, empates = 0;

while (resposta == 1) {
    var linha = valores.shift().split(" ");
    var golInter = parseInt(linha[0]);
    var golGremio = parseInt(linha[1]);
    qtdGrenais += 1;

    if (golInter > golGremio) {
        vitoriaInter += 1;
    } else if (golGremio > golInter) {
        vitoriaGremio += 1;
    } else if (golInter === golGremio) {
        empates += 1;
    }

    console.log("Novo grenal (1-sim 2-nao)");
    resposta = parseInt(valores.shift());
}

console.log(qtdGrenais + " grenais");
console.log("Inter:" + vitoriaInter);
console.log("Gremio:" + vitoriaGremio);
console.log("Empates:" + empates);

if (vitoriaInter > vitoriaGremio)
    console.log("Inter venceu mais");
else if (vitoriaGremio > vitoriaInter)
    console.log("Gremio venceu mais");
