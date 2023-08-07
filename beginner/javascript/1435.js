let input = require('fs').readFileSync('stdin', 'utf-8').split('\n'); 

var i, j, n = 1, value, iniMatriz, fimMatriz;

while(n != 0){
    n = parseInt(input.shift());

    if(n == 0)
        break;
    
    iniMatriz = 0;
    fimMatriz = n;
    value = 1;

    var m = new Array();

    while (fimMatriz !== 0) {
        for (i = iniMatriz; i < fimMatriz; i++) {
            m.push(new Array()); 
            for (j = iniMatriz; j < fimMatriz; j++) {
                m[i][j] = value;
            }
        }
    
        fimMatriz--;
        iniMatriz++;
        value++;
    }
    

    for (let i = 0; i < n; i++) {
        let rowStr = '';
        for (let j = 0; j < n; j++) {
            if (j == 0)
                rowStr += m[i][j].toString().padStart(3);
            else
                rowStr += ' ' + m[i][j].toString().padStart(3);
        }
        console.log(rowStr);
    }

    console.log();
}