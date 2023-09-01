const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question((N) => {
  const estrela = new Array(N);
  const carneiro = new Array(N);
  let totalEstrela = 0;
  let totalCarneiro = 0;

  rl.question((carneiroInput) => {
    const carneiroValues = carneiroInput.split(' ').map(Number);

    for (let i = 0; i < N; i++) {
      carneiro[i] = carneiroValues[i];
      estrela[i] = 0;
    }

    let j = 0;

    while (true) {
      if (j === 0 && carneiro[j] % 2 === 0) {
        estrela[j] = 1;
        if (carneiro[j] > 0) carneiro[j]--;
        break;
      } else if (j === (N - 1) && carneiro[j] % 2 === 1) {
        estrela[j] = 1;
        if (carneiro[j] > 0) carneiro[j]--;
        break;
      } else if (carneiro[j] % 2 === 1) {
        if (carneiro[j] > 0) carneiro[j]--;
        estrela[j] = 1;
        j++;
      } else if (carneiro[j] % 2 === 0) {
        estrela[j] = 1;
        if (carneiro[j] > 0) carneiro[j]--;
        j--;
      }
    }

    for (let i = 0; i < N; i++) {
      totalCarneiro += carneiro[i];
      totalEstrela += estrela[i];
    }

    console.log(`${totalEstrela} ${totalCarneiro}`);
    rl.close();
  });
});
