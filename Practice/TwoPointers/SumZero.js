A = [-1,0,1,2,-1,4];

function SumZero(A){
    let final_output = [];
    A.sort(function(a,b){return a - b});
        for(let i=0;i<A.length;i++){
            hs = new Set();
            for(let j=i+1;j<A.length;j++){
                let curr_output = [];
                let find_val = -(A[i]+A[j]);
                if(find_val == -0) find_val = 0;
                if(hs.has(find_val)){
                    curr_output.push(A[i]);
                    curr_output.push(A[j]);
                    curr_output.push(find_val);
                    curr_output.sort(function(a,b){return a - b});
                    final_output.push(curr_output);
                }
                else{
                    hs.add(A[j]);
                }

            }
        }

        return final_output;
}

console.log(SumZero(A));