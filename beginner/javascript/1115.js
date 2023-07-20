var input = require('fs').readFileSync('stdin', 'utf8');

var linha = input.split('\n');

var i = -1;

for(;;){
    i++;
    valores = linha[i].split(' ').map(num => parseInt(num));

    if(valores[0] > 0 && valores[1] > 0)
        console.log("primeiro");
    else if(valores[0] > 0 && valores[1] < 0)
        console.log("quarto");
    else if(valores[0] < 0 && valores[1] < 0)
        console.log("terceiro");
    else if(valores[0] < 0 && valores[1] > 0)
        console.log("segundo");
    else if(valores[0] == 0 || valores[1] == 0)
        break;
}