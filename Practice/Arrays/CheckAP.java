public class CheckAP {
    public static int ArithmetricProgression() {
		
		int[] A = {1, 39, 324, 267, 96, 77, 248, 58, 229, -18, 191, 172, 134, 286, 305, 210, 115, 20, 153};
		int L = A.length-1;
        int max = A[0];
        int min = A[0];
        
        for(int i=1;i<A.length;i++){
            if(A[i] > max){
                max = A[i];
            }
            else if(A[i] < min){
                min = A[i];
            }
        }
        
        int common_diff = (max-min)/L;
        
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int x: A) {
        	set.add(x);
        }
        
        for(int j=0;j<A.length;j++){
            int next_val = A[j] + common_diff;
            if(!set.contains(next_val)  && A[j]!= max){
                return 0;
            }
        }
        return 1;
	}
}
