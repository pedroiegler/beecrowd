var input = require('fs').readFileSync('stdin', 'utf8');

var linha = input.split('\n');
i = 0

while (true){
    valores = linha[i].split(' ');
    A = parseInt(valores[0]);
    B = parseInt(valores[1]);
    C = parseInt(valores[2]);

    if(A == 0)
        break

    X = Math.sqrt((((A * B) / C) * 100.0))
    console.log(parseInt(X));

    i++;
}