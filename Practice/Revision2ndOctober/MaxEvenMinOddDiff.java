public static int DiffBetweenEvenAndOdd() {
    int[] A = {0, 2, 9};
    int even_max = Integer.MIN_VALUE;
    int odd_min = Integer.MAX_VALUE;
    
    for(int i=0;i<A.length;i++) {
        if(A[i] % 2 == 0) {
            if(A[i] > even_max) {
                even_max = A[i];
            }
        }
        
        else if(A[i] % 2 != 0) {
            if(A[i] < odd_min) {
                odd_min = A[i];
            }
        }
    }
    
    return even_max - odd_min;
}