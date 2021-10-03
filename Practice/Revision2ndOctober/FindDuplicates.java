public class FindDuplicates {
    static int FindNumberOfDuplicates() {
		int[] A = {1, 2,3};
		
		HashSet<Integer> s = new HashSet<Integer>();
		int count = 0;
		for(int i=0;i<A.length;i++) {
			if(s.contains(A[i])) {
				count++;
			}
			else {
				s.add(A[i]);
			}
		}
		
		return count;
	}
}
