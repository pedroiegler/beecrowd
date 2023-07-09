var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split('\n');

var valor = parseFloat(valores.shift());


if(valor >= 0 && valor <= 400.00){
    console.log("Novo salario: " + ((valor * 0.15) + valor).toFixed(2));
    console.log("Reajuste ganho: " + (valor * 0.15).toFixed(2));
    console.log("Em percentual: 15 %");
}

else if(valor >= 400.01 && valor <= 800.00){
    console.log("Novo salario: " + ((valor * 0.15) + valor).toFixed(2));
    console.log("Reajuste ganho: " + (valor * 0.15).toFixed(2));
    console.log("Em percentual: 15 %");
}

else if(valor >= 800.01 && valor <= 1200.00){
    console.log("Novo salario: " + ((valor * 0.10) + valor).toFixed(2));
    console.log("Reajuste ganho: " + (valor * 0.10).toFixed(2));
    console.log("Em percentual: 10 %");
}

else if(valor >= 1200.01 && valor <= 2000.00){
    console.log("Novo salario: " + ((valor * 0.07) + valor).toFixed(2));
    console.log("Reajuste ganho: " + (valor * 0.07).toFixed(2));
    console.log("Em percentual: 7 %");
}

else{
    console.log("Novo salario: " + ((valor * 0.04) + valor).toFixed(2));
    console.log("Reajuste ganho: " + (valor * 0.04).toFixed(2));
    console.log("Em percentual: 4 %");
}