const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.on('line', line => {
    const [valorFigurinha, numIntegrantes] = line.split(' ').map(Number);
    const valorPorIntegrante = valorFigurinha / numIntegrantes;
    console.log(valorPorIntegrante.toFixed(2));
});

