var fs = require("fs");
var input = fs.readFileSync("stdin", "utf8");
var lines = input.split("\n");

var n = parseInt(lines.shift());

var str = "Feliz nat";

for(var i = 0; i < n; i++){
    str += "a";
}

str += "l!";

console.log(str);