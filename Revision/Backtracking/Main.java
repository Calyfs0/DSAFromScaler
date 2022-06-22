import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        String[] inputString = {"53..7....","6..195...",".98....6.","8...6...3","4..8.3..1","7...2...6",".6....28.","...419..5","....8..79"};
        char[][] A = new char[inputString.length][];
        for(int i=0;i<inputString.length;i++){
            char[] charArray = inputString[i].toCharArray();
            A[i] = charArray;
        }

        Sudoku sudoku = new Sudoku(A);
        String[] output = sudoku.solveSudoku(A);

        System.out.println(Arrays.toString(output));

        
    }
}
