
public class MaxSumContiguousArray {
    
    public int maxSubArray(final List<Integer> A) {
        if(A.size() == 0){
            return 0;
        }
        
		int max_so_far = A.get(0);
		int max_ending_here = A.get(0);
		
		for(int i =1;i<A.size();i++) {
		
			max_ending_here += A.get(i);
			
			if(max_ending_here < A.get(i)) {
				max_ending_here = A.get(i);
			}
			
			if(max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
			}
			
		}
        return max_so_far;
    }
}