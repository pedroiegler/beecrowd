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

    for(i = 0; i < n; i++) {
        m.push(new Array());
        for(j = 0; j < n; j++) {
            if (i == j)
                m[i][j] = 1;
            else if (i < j)
                m[i][j] = j - i + 1;
            else
                m[i][j] = i - j + 1;
        }
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
