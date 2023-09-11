const readline = require('readline');
const math = require('mathjs');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function calcularAlturaEArea(volume, diametro) {
  const raio = diametro / 2;
  const altura = volume / (math.pi * raio * raio);
  const areaBoca = math.pi * raio * raio;
  return { altura, areaBoca };
}

function lerEntrada() {
  rl.question((volume) => {
    rl.question((diametro) => {
      const { altura, areaBoca } = calcularAlturaEArea(Number(volume), Number(diametro));
      console.log(`ALTURA = ${altura.toFixed(2)}`);
      console.log(`AREA = ${areaBoca.toFixed(2)}`);
      rl.close();
    });
  });
}

lerEntrada();
 