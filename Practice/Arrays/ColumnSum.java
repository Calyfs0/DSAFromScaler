public class ColumnSum {
    public static void findSumColumn()
	{
		int[][] A = {{1, 2, 3, 4},
					{5, 6, 7, 8},
					{9, 2, 3, 4}};
		int[] output = new int[A[0].length];
		int col = 0;
		while(col<A[0].length){
			int sum = 0;
			for(int row=0;row<A.length;row++){
				sum+= A[row][col];
			}
			output[col] = sum;
			col++;
		}
	}
}
