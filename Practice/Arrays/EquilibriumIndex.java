public static int EqulibriumInArray() {
    int[] A = {1,2,3};
    int total_sum = 0;
    for(int i=0;i<A.length;i++) {
        total_sum += A[i];
    }
    
    int left_sum = 0;
    int right_sum = 0;
    
    for(int j=0;j<A.length;j++) {
        left_sum += A[j];
        right_sum = total_sum - left_sum + A[j];
        
        if(left_sum == right_sum) {
            return j;
        }
    }
    
    return -1;
}