var fs = require("fs");
var input = fs.readFileSync("stdin", "utf8");
var lines = input.split("\n");

var n = parseInt(lines.shift());

if(n == 0)
    console.log("E");
else if(n >= 1 && n <= 35)
    console.log("D");
else if(n >= 36 && n <= 60)
    console.log("C");
else if(n >= 61 && n <= 85)
    console.log("B");
else if(n >= 86 && n <= 100)
    console.log("A");
