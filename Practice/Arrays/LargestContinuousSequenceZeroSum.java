public class Solution {
    public int[] lszero(int[] A) {
        int[] pf = new int[A.length];
		pf[0] = A[0];
		for(int i=1;i<A.length;i++) {
			pf[i] = pf[i-1] + A[i];
		}
		
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		hm.put(0, -1);
		
		for(int j=0;j<pf.length;j++) {
			if(!hm.containsKey(pf[j])) {
				hm.put(pf[j], j);
			}
		}
		int startIndex = 0;
		int endIndex = 0;
		int length = 0;
		int max = 0;
		for(int k=0;k<pf.length;k++) {
			length = k - hm.get(pf[k]);
			if(max < length) {
				max = length;
				startIndex = hm.get(pf[k]);
				endIndex = k;
			}
		}
		
		List<Integer> output = new ArrayList<Integer>();
		
		for(int l = startIndex+1;l<=endIndex;l++) {
			output.add(A[l]);
		}
		
		int[] finalOutput = new int[output.size()];
		if(startIndex!=endIndex){
		    for(int x =0;x< output.size();x++){
		    finalOutput[x] = output.get(x);
		}
		
		return finalOutput;
		}
		
		else return new int[] {};
		
		
		
		
		 
		
		
    }
}
