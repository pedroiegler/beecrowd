var input = require('fs').readFileSync('stdin', 'utf8');
var linhas = input.split('\n');

var valores, t, i, pa, pb, cont, g1, g2;

t = parseInt(linhas.shift());

for(i = 0; i < t; i++){
    cont = 0;
    valores = linhas.shift().split(" ");
    pa = Math.round(parseFloat(valores[0]));
    pb = Math.round(parseFloat(valores[1]));
    g1 = parseFloat(valores[2]);
    g2 = parseFloat(valores[3]);

    for(;;){
        cont++;
        pa = pa + Math.round((pa * g1) / 100);
        pb = pb + Math.round((pb * g2) / 100);

        if(cont > 100){
            console.log("Mais de 1 seculo.");
            break;
        } else if(pa > pb){
            console.log(`${cont} anos.`);
            break;
        }
    }
}
