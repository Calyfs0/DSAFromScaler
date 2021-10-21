public class Solution {
    public int[] dNums(int[] A, int B) {
        int N = A.length;
        int[] output = new int[N-B+1];
        
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        
        for(int i=0;i<B;i++){
            int val = hm.getOrDefault(A[i],0);
            hm.put(A[i],val+1);
        }
        
        output[0] = hm.size();
        int count = 1;
        
        for(int j=B;j<N;j++){
           int ae = j;
           int re = j-B;
           
           int val1 = hm.getOrDefault(A[ae],0);
           hm.put(A[ae],val1+1);
           
           int val2 = hm.getOrDefault(A[re],0);
           if(val2==1) hm.remove(A[re]);
           else hm.put(A[re],val2-1);
            
            output[count] = hm.size();
            count++;
        }
        
        
        return output;
    }
}
