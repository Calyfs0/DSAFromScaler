public class GenerateSpiralMatrix {
    public int[][] generateMatrix(int A) {
        
        
        int[][] output = new int[A][A];
        
        if(A==1){
            output[0][0] = 1;
            return output;
        }
        int i=0;
        int j=0;
        int val = 1;
        int N = A;
        
        
        while(N>1) {
        	for(int k=0;k<N-1;k++) {
            	output[i][j] = val;
            	val++;
            	j++;
            }
            
            for(int k=0;k<N-1;k++) {
            	output[i][j] = val;
            	val++;
            	i++;
            }
            
            for(int k=0;k<N-1;k++) {
            	output[i][j] = val;
            	val++;
            	j--;
            }
            
            for(int k=0;k<N-1;k++) {
            	output[i][j] = val;
            	val++;
            	i--;
            }
            
            i++;j++;N=N-2;
        }
        if(N==1) {
        	output[i][j] = val;
        }
        
        return output;
    }
}