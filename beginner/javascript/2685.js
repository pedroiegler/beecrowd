const fs = require('fs');
const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.on('line', (line) => {
  const n = parseInt(line);

  if (n === 360 || (n >= 0 && n < 90)) {
    console.log("Bom Dia!!");
  } else if (n >= 90 && n < 180) {
    console.log("Boa Tarde!!");
  } else if (n >= 180 && n < 270) {
    console.log("Boa Noite!!");
  } else if (n >= 270 && n < 360) {
    console.log("De Madrugada!!");
  }
});

rl.on('close', () => {
  process.exit(0);
});
