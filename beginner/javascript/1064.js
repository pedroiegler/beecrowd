var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split('\n');

var i = 0, cont = 0, n, media = 0;
    
for(i = 0; i < 6; i++){
    n = parseFloat(valores.shift());
    if(n > 0){
        cont++;
        media += n;
    }
}

media = media / cont;

console.log(cont + " valores positivos");
console.log(media.toFixed(1));