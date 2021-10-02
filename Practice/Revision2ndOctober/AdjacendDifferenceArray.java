public static void AdjacendDifferenceArray() {
    int[] A = {6, 2, 4, 4, 3};
    int[] output = new int[A.length-1];
    
    for(int i=0;i< A.length-1;i++) {
        output[i] = A[i+1] - A[i];
    }
    
    System.out.println(Arrays.toString(output));
}