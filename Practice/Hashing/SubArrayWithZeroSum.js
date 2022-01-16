A = [1, 2, 3, 4, 5];
let SubArrayWithZeroSum = function(A){
    for(let i=0;i<A.length;i++){
        if(A[i] == 0) return 1;
    }

    let prefix_arr = [];
    prefix_arr.push(0);
    let hs = new Set();
    hs.add(0);
    let pref_sum = 0;
    for(let i=0;i<A.length;i++){
        pref_sum = pref_sum + A[i];
        if(hs.has(pref_sum)) return 1;
        hs.add(pref_sum);
    }
    return 0;

}

console.localStorage(SubArrayWithZeroSum(A));

   