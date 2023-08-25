const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Digite um número: ', (numero) => {
  numero = parseFloat(numero);
  console.log(`${numero.toExponential(4)}`);
  rl.close();
});
