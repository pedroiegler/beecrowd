var input = require('fs').readFileSync('stdin', 'utf8').split('\n');

var n = input[0]

for(var i = 1; i <= n; i++){
    var entrada = input[i].split(" ");

    var nome = entrada[0];
    var numero = parseInt(entrada[1]);

    if(nome == "Thor")
        console.log("Y");
    else    
        console.log("N")
}

