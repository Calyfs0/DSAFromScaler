public static int[] TwoGreaterElements(int[] A) {
		
    int L = A.length;
    int[] output = new int[L-2];
    
    int first_max = Integer.MIN_VALUE;
    int second_max = Integer.MIN_VALUE;
    
    for(int i=0;i<L;i++) {
        if(A[i] > first_max) {
            second_max = first_max;
            first_max = A[i];
        }
        else if(A[i] > second_max) {
            second_max = A[i];
        }
    }
    int j = 0;
    for(int i=0;i<L;i++) {
        if(A[i] < second_max) {
            output[j] = A[i];
            j++;
        }
    }
    
    return output;
    
}
