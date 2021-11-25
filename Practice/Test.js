A = [1, 2, 5, -7, 2, 5 ]
let curr_sum = A[0]
let max_sum = A[0]
output = [A[0]]
for(let i=1;i<A.length;i++){
    if(A[i] > 0){
        curr_sum += A[i]
       
        max_sum = Math.max(curr_sum, max_sum)
        if(curr_sum <= max_sum) output.push(A[i])
        if(curr_sum < 0) curr_sum = 0
    }
    else{
        curr_sum = 0
        output = []
    }
}

console.log(output)