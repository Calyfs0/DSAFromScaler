A = 5
B = 
[
  [1, 2, 10],
  [2, 3, 20],
  [2, 5, 25]
]
let input = []
let output = []

for(let i=0;i<A;i++){
    input.push(0)
    output.push(0)
}

for(let j=0;j<B.length;j++){
    input[B[0]] = B[2]
    if(B[1]+1 < B.length){
        input[B[1]+1] = -B[2]
    }
}


for(let k = 1;k < input.length;k++){
    output[k] = input[k] + output[k-1]
}

console.log(output) 