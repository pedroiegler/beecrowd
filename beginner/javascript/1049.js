var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split('\n');

var p1 = valores.shift();
var p2 = valores.shift();
var p3 = valores.shift();

if (p1 === "vertebrado") {
    if (p2 === "ave") {
        if (p3 === "carnivoro") {
            console.log("aguia");
        } else if (p3 === "onivoro") {
            console.log("pomba");
        }
    } else if (p2 === "mamifero") {
        if (p3 === "onivoro") {
            console.log("homem");
        } else if (p3 === "herbivoro") {
            console.log("vaca");
        }
    }
} else if (p1 === "invertebrado") {
    if (p2 === "inseto") {
        if (p3 === "hematofago") {
            console.log("pulga");
        } else if (p3 === "herbivoro") {
            console.log("lagarta");
        }
    } else if (p2 === "anelideo") {
        if (p3 === "hematofago") {
            console.log("sanguessuga");
        } else if (p3 === "onivoro") {
            console.log("minhoca");
        }
    }
}
