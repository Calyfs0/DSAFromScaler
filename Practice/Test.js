N = 100

function FindSqrt(N){
    start = 1
    end = N
    

    while(true){
        mid = Math.floor((start + end)/2)
        if(mid * mid == N){
            return mid
        }
        else if(mid * mid > N){
            end = mid -1
        }
        else if(mid * mid < N){
            start = mid + 1
        }
    }
}

console.log(FindSqrt(N))