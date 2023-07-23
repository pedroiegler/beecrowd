const input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split('\n');
n1 = parseInt(valores.shift())
n2 = parseInt(valores.shift())

if(n1 > n2){
    maior = n1;
    menor = n2;
}else{
    maior = n2;
    menor = n1;
}

menor = menor + 1;

for(i = menor; i < maior; i++){
    if(i % 5 == 2 || i % 5 == 3){
       console.log(i);
    }
}