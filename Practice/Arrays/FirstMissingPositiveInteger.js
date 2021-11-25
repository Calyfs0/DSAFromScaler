A = [2, 3, 1, 2]

let N = A.length
console.log(MissingFirstInteger(A,N))
function MissingFirstInteger(A,N){

    for(let i=0;i<N;i++){
        isSwap = true
        while(isSwap){
            let val = A[i]
            if((val == i+1) || (val > N) || (val < 1) || A[val-1] == val){
                isSwap = false
            }
            else{
                A[i] = A[val - 1]
                A[val - 1] = val
            }
        }
    }

    for(let i=0;i<N;i++){
        if(A[i]!=i+1){
            return i+1
        }
    }

    return N+1
}
