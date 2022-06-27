public class MinSumPath {
    int sum;
    public int minPathSum(int[][] A) {
        sum = Integer.MAX_VALUE;
        int n = A.length;
        int m = A[0].length;
        int dp[][] = new int[n][m];

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        return findMinSum(A,0,0,n, m,dp);

        
    }

    public int findMinSum(int[][] A, int i, int j, int n, int m,int[][] dp){
        if(i == n-1 && j == m-1)
         {   
             return A[i][j];
         }

         if(dp[i][j]!= -1) return dp[i][j];

        int down =  (i == n-1)?Integer.MAX_VALUE: findMinSum(A,i+1,j,n,m, dp);
        int right = (j== m-1)? Integer.MAX_VALUE: findMinSum(A,i,j+1,n,m, dp);
        dp[i][j] = Math.min(down ,right ) + A[i][j];

        return dp[i][j];

    }

    
}
