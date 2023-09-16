var input = require("fs").readFileSync("stdin", "utf8");
var lines = input.split("/");

var dia, mes;

dia = parseInt(lines[0]);
mes = parseInt(lines[1]);

if((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20))
    console.log("aries");
else if((mes == 4 && dia >= 21) || (mes == 5 && dia <= 20))
    console.log("touro");
else if((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20))
    console.log("gemeos");
else if((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22))
    console.log("cancer");
else if((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22))
    console.log("leao");
else if((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22))
    console.log("virgem");
else if((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22))
    console.log("libra");
else if((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21))
    console.log("escorpiao");
else if((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21))
    console.log("sagitario");
else if((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19))
    console.log("capricornio");
else if((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18))
    console.log("aquario");
else if((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20))
    console.log("peixes");