var input = require("fs").readFileSync("stdin", "utf8");
var lines = input.split("\n");

let contador = 0;

let mensagem = lines.shift();

for (let i = 0; i < mensagem.length; i++) {
  if (mensagem.charAt(i) === '1') {
    contador++;
  }
}

if (contador % 2 === 0) {
  mensagem += '0';
} else {
  mensagem += '1';
}

console.log(mensagem);