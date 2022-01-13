function PairWithGivenSumII(A,B){
    let i = 0;
        let j = A.length -1;
        let mod = 1000000007;
        let count = 0;

        while(i<j){
            if(A[i]+A[j] == B){
                let ithValue = A[i];
                let jthValue = A[j];
                i++;
                j--;
                let iCount = 1;
                while(A[i]==ithValue){
                    iCount++;
                    i++;
                }
                let jCount = 1;
                while(A[j]==jthValue){
                    jCount++;
                    j--;
                }
                if(ithValue == jthValue) count+= iCount * (iCount-1)/2;
                else count += iCount * jCount;
            }
            else if(A[i] + A[j] < B){
                i++;
            }
            else j--;
        }

        return count%mod;
}