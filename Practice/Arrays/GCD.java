public static int GCD(int A, int B) {
    int min = Math.min(A,B);
    int max = Math.max(A,B);
    while(min>0 && max>0) {
        max = max%min;
        int temp = min;
        min = max;
        max = temp;
    }
    
    return max;
    
    
}