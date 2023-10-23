const fs = require('fs');
const input = fs.readFileSync('/dev/stdin', 'utf8');
const lines = input.trim().split('\n');

var atendidos = lines.shift().split(" ");
var requisitados = lines.shift().split(" ");

var nao_atendidos = 0;

for(var i = 0; i < 3; i++){
    if(parseInt(requisitados[i]) > parseInt(atendidos[i]))
        nao_atendidos += parseInt(requisitados[i]) - parseInt(atendidos[i])
}
        
console.log(nao_atendidos)