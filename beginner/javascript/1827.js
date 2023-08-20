const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function matrix(tamanho) {
  const m = Array.from({ length: tamanho }, () => Array(tamanho).fill(0));

  for (let linha = 0; linha < tamanho; linha++) {
    for (let coluna = 0; coluna < tamanho; coluna++) {
      if (linha === coluna) {
        m[linha][coluna] = 2;
      } else if (linha === tamanho - coluna - 1) {
        m[linha][coluna] = 3;
      } else {
        m[linha][coluna] = 0;
      }
    }
  }

  const inicio = Math.floor(tamanho / 3);
  const fim = tamanho - inicio;

  for (let linha = inicio; linha < fim; linha++) {
    for (let coluna = inicio; coluna < fim; coluna++) {
      m[linha][coluna] = 1;
    }
  }

  const meio = Math.floor(tamanho / 2);
  m[meio][meio] = 4;

  for (let linha = 0; linha < tamanho; linha++) {
    console.log(m[linha].join(""));
  }

  console.log();
}

rl.on('line', (input) => {
  const tamanho = parseInt(input);
  matrix(tamanho);
});

