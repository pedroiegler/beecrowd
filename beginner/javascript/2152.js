var input = require("fs").readFileSync("stdin", "utf8");
var lines = input.split("\n");

var n, i, h, m, o;
    
n = parseInt(lines.shift());

for(i = 0; i < n; i++){
    var valores = lines.shift().split(" ");
    h = parseInt(valores[0]);
    m = parseInt(valores[1]);
    o = parseInt(valores[2]);
    
    if(h < 10 && m < 10){
        if(o == 1)
            console.log(`0${h}:0${m} - A porta abriu!`);
        else
            console.log(`0${h}:0${m} - A porta fechou!`);
    } else if(h < 10 && m >= 10){
        if(o == 1)
            console.log(`0${h}:${m} - A porta abriu!`);
        else
            console.log(`0${h}:${m} - A porta fechou!`);
    } else if(h >= 10 && m < 10){
        if(o == 1)
            console.log(`${h}:0${m} - A porta abriu!`);
        else
            console.log(`${h}:0${m} - A porta fechou!`);
    } else if(h >= 10 && m >= 10){
        if(o == 1)
            console.log(`${h}:${m} - A porta abriu!`);
        else
            console.log(`${h}:${m} - A porta fechou!`);
    }

}