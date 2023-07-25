var input = require('fs').readFileSync('stdin', 'utf8');
var valores = input.split('\n');

var x, z, i, soma = 0, cont = 0;

x = parseInt(valores.shift());
z = parseInt(valores.shift());

while (z <= x){
    z = parseInt(valores.shift());
}

for(;;){
    if(soma > z){
        break;
    }else{
        cont++;
        soma += x;
        x++;
    }
}

console.log(cont);
