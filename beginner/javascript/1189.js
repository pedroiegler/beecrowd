let input = require('fs').readFileSync('/dev/stdin', 'utf-8').split('\n'); 

var m = new Array();
var i, j;
var operacao;

operacao = input.shift();

for(i = 0; i < 12; i++){
    m.push(new Array());
    for(j = 0; j < 12; j++){
        m[i][j] = parseFloat(input.shift());
    }
}

console.log(soma_or_media(m,operacao).toFixed(1));


function soma_or_media(mat, op){
var p = 0, r = 4, i, j, cont = 0;
var soma = 0.0;

for(i = 1; i < 11; i++){
    if(i <= 5){
      for(j = 0; j <= p; j++)
          soma += mat[i][j];
          cont++;
      p++;
    }
    else if(i >= 6){
      for(j = 0; j <= r; j++)
          soma += mat[i][j];
          cont++;
      r--;
    }
}


if(op == 'S'){
    return soma;
} else{
    return soma/cont;
}
}