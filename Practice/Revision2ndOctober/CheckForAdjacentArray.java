public static int CheckForAdjacentArray()
	{
		int[] A = {3, 2, 1, 4, 5};
		
		int max = A[0];
		int min = A[0];
		
		for(int j=1;j<A.length;j++) {
			if(A[j] > max ) {
				max = A[j];
			}
			else if(A[j] < min) {
				min = A[j];
			}
			
		}
		int L = max-min+1;
		if(A.length != max-min+1) {
			return 0;
		}
		
		for(int i=0;i<A.length;i++) {
			int index = Math.abs(A[i]) - min;
			
			if(index > A.length -1 || index < 0 || A[index] < 0) {
				return 0;
			}
			
			A[index] = -A[index];
		}
		
		return 1;
	}