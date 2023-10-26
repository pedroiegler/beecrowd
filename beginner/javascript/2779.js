const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let N, M;
const album = new Array(N + 1).fill(0); 

rl.question((n) => {
  N = parseInt(n);
  rl.question((m) => {
    M = parseInt(m);
    rl.question((figurinhas) => {
      const compradas = figurinhas.split(' ').map(Number);

      for (const figurinha of compradas) {
        album[figurinha] = 1; 
      }

      let faltam = 0;
      for (let i = 1; i <= N; i++) {
        if (album[i] === 0) {
          faltam++; 
        }
      }

      console.log(`${faltam}`);

      rl.close();
    });
  });
});
