const A = [12, 1, 9, 6, 2];
function CheckForBSTWithOneChild(A) {
  if(A <=1) return "YES";
        let leftLimit = Number.MIN_SAFE_INTEGER;
        let rightLimit = Number.MAX_SAFE_INTEGER;
        
        for(let i=1;i<A.length;i++){
            if(A[i] < leftLimit || A[i] > rightLimit) return "NO";
            if(A[i] > A[i-1]){
                leftLimit = A[i-1];
            }
            else{
                rightLimit = A[i-1];
            }
        }

        return "YES";
}

console.log(CheckForBSTWithOneChild(A));
