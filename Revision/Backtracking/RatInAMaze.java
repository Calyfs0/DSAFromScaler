import java.util.Arrays;

public class RatInAMaze{

    public static void main(String[] args) {
        int[][] A = {{1,1,1},{1,0,1},{0,0,1}};
        RatInAMaze ratInAMaze = new RatInAMaze();
        int[][] output = ratInAMaze.getPath(A);
        for(int[] a : output){
            System.out.println(Arrays.toString(a));
        }
        

        
    }

    public int[][] getPath(int[][] A){
        int n = A.length;
        int[][] currentOutput = new int[n][n];
        int[][] finalOutput = new int[n][n];
        tryAllPossiblePathAndGetPath(0,0,A,currentOutput,finalOutput);

        return finalOutput;

    }

    public void tryAllPossiblePathAndGetPath(int i, int j, int[][] A, int[][] currentOutput, int[][] finalOutput){
        if(i== A.length -1 && j== A.length -1){
            currentOutput[i][j] = 1;
            for(int row = 0;row<A.length;row++){
                for(int col = 0; col<A.length;col++){
                    finalOutput[row][col] = currentOutput[row][col];
                }
            }
            return;
        }

        if(i < 0 || j < 0 || i > A.length - 1 || j > A.length-1 || A[i][j] == 0 || A[i][j] == 2){
            return;
        }

        A[i][j] = 2;
        currentOutput[i][j] = 1;
        tryAllPossiblePathAndGetPath(i+1, j, A, currentOutput, finalOutput);
        tryAllPossiblePathAndGetPath(i-1, j, A, currentOutput, finalOutput);
        tryAllPossiblePathAndGetPath(i, j+1, A, currentOutput, finalOutput);
        tryAllPossiblePathAndGetPath(i, j-1, A, currentOutput, finalOutput);
        currentOutput[i][j] = 0;
    }
}