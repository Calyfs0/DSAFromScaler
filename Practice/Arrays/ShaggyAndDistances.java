public class Solution {
    public int solve(int[] A) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        
        for(int i=0;i<A.length;i++){
            if(!hm.containsKey(A[i])){
                hm.put(A[i],i);
            }
        }
        
        int startIndex = 0;
        int endIndex = 0;
        int length = 0;
        int min = Integer.MAX_VALUE;
        
        for(int j=0;j<A.length;j++){
            if(j!= hm.getOrDefault(A[j],0)){
                int val = hm.getOrDefault(A[j],0);
                length = j-val;
                if(length < min){
                    min = length;
                    startIndex = hm.getOrDefault(A[j],0);
                    endIndex = j;
            }    
            }
            
        }
        
        if(endIndex > startIndex) return endIndex - startIndex;
        return -1;
    }
}
