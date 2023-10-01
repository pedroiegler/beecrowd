var input = require("fs").readFileSync("stdin", "utf8");
var lines = input.split("\n");

var texto = lines.shift();
var qtsCaracteres = texto.length;

if (qtsCaracteres > 140) {
    console.log("MUTE");
} else {
    console.log("TWEET");
}