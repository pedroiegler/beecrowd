const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('', (texto) => {
  if (texto.length < 81) {
    console.log("YES");
  } else {
    console.log("NO");
  }
  rl.close();
});
