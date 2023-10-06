var input = require("fs").readFileSync("stdin", "utf8");
var lines = input.split("\n");

var n, i, bonus, at1, at2, df1, df2, lvl1, lvl2;

n = parseInt(lines.shift());

for(i = 0; i < n; i++){
    bonus = parseInt(lines.shift());
    
    var valores1 = lines.shift().split(" ");

    at1 = parseInt(valores1[0]);
    df1 = parseInt(valores1[1]);
    lvl1 = parseInt(valores1[2]);

    var valores2 = lines.shift().split(" ");

    at2 = parseInt(valores2[0]);
    df2 = parseInt(valores2[1]);
    lvl2 = parseInt(valores2[2]);


    var golpe1 = ((at1 + df1) / 2);
    var golpe2 = ((at2 + df2) / 2);

    if(lvl1 % 2 == 0)
        golpe1 += bonus;
    if(lvl2 % 2 == 0)
        golpe2 += bonus;

    if(golpe1 > golpe2)
        console.log("Dabriel");
    else if(golpe2 > golpe1)
        console.log("Guarte");
    else
        console.log("Empate");

}