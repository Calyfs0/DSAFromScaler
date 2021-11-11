public class Solution {
    public int solve(int[] A) {
        Arrays.sort(A);
        long pow = 1;
        long mod = 1000000007;
        long output = 0;
        for(int i=0;i<A.length;++i){
            output = (output + A[i] * pow - A[A.length-1-i] * pow) % mod;
            pow = pow * 2 % mod;
        }

        return (int)((output + mod) % mod);
    }
    
}

 
