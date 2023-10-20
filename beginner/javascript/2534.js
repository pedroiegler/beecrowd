function bubbleSort(arr) {
    const n = arr.length;
    let temp;

    for (let i = 0; i < n - 1; i++) {
        for (let j = 0; j < n - 1 - i; j++) {
            if (arr[j] < arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            } 
        }
    }
}

const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question((input) => {
    const [n, q] = input.split(' ').map(Number);
    rl.question((numbersInput) => {
        const numbers = numbersInput.split(' ').map(Number);

        bubbleSort(numbers);

        for (let i = 0; i < q; i++) {
            rl.question((positionInput) => {
                const position = parseInt(positionInput);

                if (position >= 1 && position <= n) 
                    console.log(numbers[position - 1]);

                if (i === q - 1) 
                    rl.close();
            });
        }
    });
});
