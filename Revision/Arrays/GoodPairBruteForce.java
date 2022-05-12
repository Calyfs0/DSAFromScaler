public class GoodPairBruteForce {
    public int solve(int[] A, int B) {
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i]+A[j] == B) return 1;
            }
        }
        return 0;
    }
}