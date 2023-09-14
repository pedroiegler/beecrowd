var input = require("fs").readFileSync("stdin", "utf8");
var lines = input.split(" ");


var saida = parseInt(lines[0]);
var tempo = parseInt(lines[1]);
var fuso = parseInt(lines[2]);

if(saida == 0)
    saida = 24;

var chegada = saida + tempo + fuso;

if(chegada > 24){
    chegada -= 24;
    console.log(chegada);
} else if(chegada == 24){
    chegada = 0;
    console.log(chegada);
} else{
    console.log(chegada);
}