A = [1, 3, -1]


let sum1 = 0
let sum2 = 0
let min = A[0]
let max = A[0]
for(let i=1;i<A.length;i++){
    min = Math.min(A[i]+i,min)
    max = Math.max(A[i]+i,max)
}

sum1 = max - min
min = A[0]
max = A[0]
for(let k=0;k<A.length;k++){
    min = Math.min(A[k]-k,min)
    max = Math.max(A[k]-k,max)
    
}
sum2 = max - min
//return Math.max(sum1,sum2)
console.log(Math.max(sum1,sum2))