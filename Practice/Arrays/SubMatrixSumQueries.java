public class SubMatrixSumQueries {
    public int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {
        int N = A.length;
        int M = A[0].length;
        long mod = 1000000007;
        long[][] pref = new long[N][M];
        for(int row = 0;row < N;row++){
            for(int col = 0;col < M; col++){
                if(col == 0) pref[row][col] = A[row][col];
                else pref[row][col] = (A[row][col] +  pref[row][col-1]);
                pref[row][col] = pref[row][col]%mod;
                
            }
        }

        for(int col = 0;col < M;col++){
            for(int row = 1;row < N; row++){
                pref[row][col] = (pref[row][col] + pref[row-1][col]);
                pref[row][col] = pref[row][col]%mod;
            }
        }
        int[] output = new int[B.length];
        for(int i = 0;i<B.length;i++){
            int a1 = B[i] - 1;  //As indexing is from 1 in question
            int b1 = C[i] - 1;
            int a2 = D[i] - 1;
            int b2 = E[i] - 1;

            long sum = pref[a2][b2];
            if(sum < 0){
                sum = sum + mod;
            }

            if(a1>0) sum -= pref[a1-1][b2];
            if(b1>0) sum -= pref[a2][b1-1];
            if(a1>0 && b1>0) sum += pref[a1-1][b1-1];
            sum = sum%mod;
            if(sum < 0){
                sum = sum + mod;
            }
            
            output[i] = (int)(sum);


        }

        return output;

    }
}
