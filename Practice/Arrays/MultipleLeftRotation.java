package Arrays;

public class MultipleLeftRotation {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        
        ArrayList<ArrayList<Integer>> final_output = new ArrayList<ArrayList<Integer>>();
		
		
		for(int x =0; x < B.size() ;x++) {
			ArrayList<Integer> C = new ArrayList<Integer>(A);
			int k = B.get(x)%A.size();
			
			int i = 0;
			int j = C.size() -1;
			while(i<j) {
				C.set(i, C.get(i)^C.get(j));
				C.set(j, C.get(i)^C.get(j));
				C.set(i, C.get(i)^C.get(j));
				i++;
				j--;
			}
			
			
			i = 0;
			j = C.size() - k -1;
			
			while(i<j) {
				C.set(i, C.get(i)^C.get(j));
				C.set(j, C.get(i)^C.get(j));
				C.set(i, C.get(i)^C.get(j));
				i++;
				j--;
			}
			
			
			i = C.size() -k;
			j = C.size() -1;
			
			while(i<j) {
				C.set(i, C.get(i)^C.get(j));
				C.set(j, C.get(i)^C.get(j));
				C.set(i, C.get(i)^C.get(j));
				i++;
				j--;
			}
			
			final_output.add(C);
		}
		return final_output;
    }
}
