

public class Sudoku {

    char[][] A;
    public Sudoku(char[][] A) {
        this.A = A;
        
    }
    
	public String[] solveSudoku(char[][] A) {
        int n = A.length;
        ValidSudoku(0,n*n,A);
        String[] output = new String[A.length];
        int index = 0;
        for(char[] c : A){
        StringBuilder sb = new StringBuilder();

            for(int i=0;i<c.length;i++){
                sb.append(c[i]);
            }
            output[index] = sb.toString();
            index++;
        }

       return output;

	}

    public boolean ValidSudoku(int i, int n, char[][] A){
        if(i == n){
            return true;
        }

        int row = i/A.length;
        int col = i%A.length;
        int boxSize = (int)Math.sqrt(A.length);
        int boxStartRow = row - row%boxSize;
        int boxStartCol = col - col%boxSize;
        if(A[row][col] != '.'){
            return ValidSudoku(i+1,n,A);
        }
        char ch = '1';
        for(int val = 0;val<A.length;val++,ch++){
            if(isValidNumber(A,row,col,boxStartRow,boxStartCol,ch,boxSize)){
                A[row][col] = ch;
                if(ValidSudoku(i+1,n,A)){
                    return true;
                }
                else{
                    A[row][col] = '.';
                }
            }
            
        }
        return false;
    }

    public boolean isValidNumber(char[][] A, int row, int col, int boxStartRow, int boxStartCol, char currentChar, int boxSize){
        for(int i=0;i<A.length;i++){
            if(A[row][i] == currentChar) return false;
        }

        for(int i=0;i<A.length;i++){
            if(A[i][col] == currentChar) return false;
        }
        
        for(int i=boxStartRow;i<boxStartRow+boxSize;i++){
            for(int j=boxStartCol;j<boxStartCol+boxSize;j++){
                if(A[i][j] == currentChar) return false;
            }
        }
        return true;
    }
}

