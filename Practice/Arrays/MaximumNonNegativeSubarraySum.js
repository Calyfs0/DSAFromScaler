A = [756898537, -1973594324, -2038664370, -184803526, 1424268980 ]
let curr_sum = 0
let max_sum = Number.MIN_SAFE_INTEGER
let Curr_arr = []
let final_arr = []

for(let i=0;i< A.length;i++){
    if(A[i]>=0){
        curr_sum += A[i]
        Curr_arr.push(A[i])
    }
    else{
        if(curr_sum > max_sum){
            max_sum = curr_sum
            final_arr = Curr_arr
        }
        else if(curr_sum == max_sum && Curr_arr.length > final_arr.length){
            final_arr = Curr_arr
        }

        Curr_arr = []
        curr_sum = 0
    }

    if(curr_sum > max_sum){
        max_sum = curr_sum
        final_arr = Curr_arr
    }
    else if(curr_sum == max_sum && Curr_arr.length > final_arr.length){
        final_arr = Curr_arr
    }
}

console.log(final_arr)