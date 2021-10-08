public class MatMultiplication {
    public static void MatrixMultiplication()
	{
		int[][] A = {
				{1, 2,4,6},
				{3, 4,5,6},
				{1, 2,4,6},
				{3, 4,5,6},
				{1, 2,4,6},
				{3, 4,5,6},
				{3, 4,5,6},
				{3, 4,5,6}
				};
		int[][] B = {
				{5, 6,3},
				{7, 8,7},
				{5, 6,3},
				{7, 8,7},
				};
		if(A[0].length != B.length){
            return;
        }
        
        int l = A.length;
        int b = B[0].length;
        
        int[][] output = new int[l][b];
        
        for(int i=0;i<l;i++){
            for(int j=0;j<b;j++){
                int sum = 0;
                for(int k=0;k<A[0].length;k++){
                    sum += A[i][k] * B[k][j];
                }
                output[i][j] = sum;
            }
        }
	}
}
