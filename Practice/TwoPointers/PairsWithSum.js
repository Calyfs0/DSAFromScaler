let A = [-3,0,1,3,6,8,11,14,18,25];
let B = 17;

function FindPairs(A,B){
    let i = 0;
        let j = A.length; -1;
        let count = 0;
        while(i<j){
            if(A[i] + A[j] == B) {
                count++;
                i++;
                j--;
            }
            else if(A[i]+A[j] < B){
                i++;
            }
            else j--;
        }

        return count;
}

console.log(FindPairs(A,B));
