var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split('\n');
var senha;

while(true){
    senha = parseInt(valores.shift());

    if(senha == 2002){
        console.log("Acesso Permitido");
        break;
    } else
        console.log("Senha Invalida");
}
