const input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split('\n');
var tipo = 0, contAlcool = 0, contDiesel = 0, contGasolina = 0;

while(tipo != 4){
    tipo = parseInt(valores.shift());

    if(tipo == 1){
        contAlcool+=1;
    }
    else if(tipo == 2){
        contGasolina+=1;
    }
    else if(tipo == 3){
        contDiesel+=1;
    }
}


console.log("MUITO OBRIGADO");
console.log("Alcool: " + contAlcool);
console.log("Gasolina: " + contGasolina);
console.log("Diesel: " + contDiesel);