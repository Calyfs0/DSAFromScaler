public class RotateMatrix90Degree {
    public void solve(int[][] A) {
        
        for(int i=0;i<A.length -1;i++){
            for(int j=i+1;j<A[0].length;j++){
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        
        for(int k = 0;k<A.length;k++){
            for(int l = 0; l<A[0].length/2;l++){
                int val = A[k][l];
                A[k][l] = A[k][A.length -1 - l];
                A[k][A.length -1 - l] = val;
            }
        }
        
    }
}
