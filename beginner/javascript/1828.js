var input = require('fs').readFileSync('stdin', 'utf8').split('\n');

var n, p1, p2;

n = parseInt(input[0]);

for (var i = 1; i <= n; i++) {
    var valores = input[i].split(' ');
    p1 = valores[0];
    p2 = valores[1];

    if (p1 === 'tesoura') {
        if (p2 === 'pedra' || p2 === 'Spock')
            console.log(`Caso #${i}: Raj trapaceou!`);
        else if (p2 === 'papel' || p2 === 'lagarto')
            console.log(`Caso #${i}: Bazinga!`);
        else if (p2 === 'tesoura')
            console.log(`Caso #${i}: De novo!`);

    } else if (p1 === 'pedra') {
        if (p2 === 'Spock' || p2 === 'papel')
            console.log(`Caso #${i}: Raj trapaceou!`);
        else if (p2 === 'tesoura' || p2 === 'lagarto')
            console.log(`Caso #${i}: Bazinga!`);
        else if (p2 === 'pedra')
            console.log(`Caso #${i}: De novo!`);

    } else if (p1 === 'papel') {
        if (p2 === 'pedra' || p2 === 'Spock')
            console.log(`Caso #${i}: Bazinga!`);
        else if (p2 === 'tesoura' || p2 === 'lagarto')
            console.log(`Caso #${i}: Raj trapaceou!`);
        else if (p2 === 'papel')
            console.log(`Caso #${i}: De novo!`);

    } else if (p1 === 'Spock') {
        if (p2 === 'pedra' || p2 === 'tesoura')
            console.log(`Caso #${i}: Bazinga!`);
        else if (p2 === 'lagarto' || p2 === 'papel')
            console.log(`Caso #${i}: Raj trapaceou!`);
        else if (p2 === 'Spock')
            console.log(`Caso #${i}: De novo!`);
            
    } else if (p1 === 'lagarto') {
        if (p2 === 'pedra' || p2 === 'tesoura')
            console.log(`Caso #${i}: Raj trapaceou!`);
        else if (p2 === 'Spock' || p2 === 'papel')
            console.log(`Caso #${i}: Bazinga!`);
        else if (p2 === 'lagarto')
            console.log(`Caso #${i}: De novo!`);
    }
}
