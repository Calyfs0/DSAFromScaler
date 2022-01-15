A = [-6, -4, -5, -2, -3];
let maxConsecutiveLength = function(A){
    const hs = new Set(A);
    let ans = 0;

    for(let num of A){
        if(!hs.has(num-1)){
            let curr_count = 0;
            while(hs.has(num++)){
                curr_count++;
            }
            ans = Math.max(ans,curr_count);
        }
    }

    return ans;
}

console.log(maxConsecutiveLength(A));