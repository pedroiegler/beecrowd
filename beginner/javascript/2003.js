const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.on('line', (input) => {
  const [hora, minuto] = input.split(':').map(Number);

  if (hora >= 5 && hora <= 6) {
    console.log("Atraso maximo: 0");
  } else if (hora === 7) {
    console.log("Atraso maximo:", minuto);
  } else if (hora === 8) {
    console.log("Atraso maximo:", 60 + minuto);
  } else if (hora === 9) {
    console.log("Atraso maximo:", 120 + minuto);
  }
});

rl.on('close', () => {
  process.exit(0);
});
