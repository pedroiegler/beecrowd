const fs = require('fs');
const input = fs.readFileSync('stdin', 'utf8');
const lines = input.trim().split('\n');

let index = 0;

while (index < lines.length) {
    const N = parseInt(lines[index++]);
    const valores = lines[index++].split(" ");
    
    let votos_favoraveis = 0;
    
    for (let i = 0; i < N; i++) {
        const voto = parseInt(valores[i]);
        votos_favoraveis += voto;
    }
    
    if (votos_favoraveis * 3 >= 2 * N)
        console.log("impeachment");
    else
        console.log("acusacao arquivada");
}
