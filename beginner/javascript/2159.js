var fs = require("fs");
var input = fs.readFileSync("stdin", "utf8");
var lines = input.split("\n");

const n = parseInt(lines.shift());
  
const result1 = n / Math.log(n);
const result2 = 1.25506 * (n / Math.log(n));

console.log(result1.toFixed(1), result2.toFixed(1));