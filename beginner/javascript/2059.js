var input = require("fs").readFileSync("stdin", "utf8");
var lines = input.split(" ");

var p = parseInt(lines[0]);
var j1 = parseInt(lines[1]);
var j2 = parseInt(lines[2]);
var r = parseInt(lines[3]);
var a = parseInt(lines[4]);

var soma = j1 + j2;

if(p == 1){
    if(soma % 2 == 0){
        if(r == 0){
            if(a == 0 || a == 1)
                console.log("Jogador 1 ganha!");
        }
        else if(r == 1){
            if(a == 0)
                console.log("Jogador 1 ganha!");
            else if(a == 1)
                console.log("Jogador 2 ganha!");
        }
    }    
    else{
        if(r == 0){
            if(a == 0)
                console.log("Jogador 2 ganha!");
            else if(a == 1)
                console.log("Jogador 1 ganha!");
        }
        else if(r == 1){
            if(a == 0)
                console.log("Jogador 1 ganha!");
            else if(a == 1)
                console.log("Jogador 2 ganha!");
        }
    }
}        
            
else if(p == 0){
    if(soma % 2 != 0){
        if(r == 0){
            if(a == 0 || a == 1)
                console.log("Jogador 1 ganha!");
        }   
        else if(r == 1){
            if(a == 0)
                console.log("Jogador 1 ganha!");
            else if(a == 1)
                console.log("Jogador 2 ganha!");
        }
    }
    else{ 
        if(r == 0){
            if(a == 0)
                console.log("Jogador 2 ganha!");
            else if(a == 1)
                console.log("Jogador 1 ganha!");
        }
        else if(r == 1){
            if(a == 0)
                console.log("Jogador 1 ganha!");
            else if(a == 1)
                console.log("Jogador 2 ganha!");
        }
    }
}

   