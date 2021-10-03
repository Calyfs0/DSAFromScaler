public static void RemoveDuplicates() {
    ArrayList<Integer> output = new ArrayList<Integer>();
    
    int length = 1;
    int[] A = {0,0,1,1,1,2,2,3,3,3,4};
    output.add(A[0]);
    for(int i=1;i<A.length;i++) {
        if(A[i]!=A[i-1]) {
            length++;
            output.add(A[i]);
        }
    }
    
    System.out.println(length);
    for(int x: output) {
        System.out.print(x + " ");
    }
    
}