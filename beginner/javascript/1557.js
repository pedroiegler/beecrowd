const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let inputCount = 0;
let n;

rl.on('line', (input) => {
  if (inputCount === 0) {
    n = parseInt(input);
    inputCount++;
  } else {
    const m = new Array(n).fill().map(() => new Array(n));
    let elemento = 1;

    for (let i = 0; i < n; i++) {
      for (let j = 0; j < n; j++) {
        m[i][j] = elemento;
        elemento *= 2;
      }
      elemento = m[i][0] * 2;
    }

    let digitos = 0;
    let t = m[n - 1][n - 1];

    do {
      t = Math.floor(t / 10);
      digitos++;
    } while (t > 0);

    for (let i = 0; i < n; i++) {
      let row = '';
      for (let j = 0; j < n; j++) {
        if (j === 0) {
          row += `${m[i][j].toString().padStart(digitos, ' ')}`;
        } else {
          row += ` ${m[i][j].toString().padStart(digitos + 1, ' ')}`;
        }
      }
      console.log(row);
    }

    console.log('');
    inputCount = 0;
  }
});
