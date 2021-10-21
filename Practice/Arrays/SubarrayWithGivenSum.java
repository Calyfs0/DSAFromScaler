public class Solution {
    public int[] solve(int[] A, int B) {
        if (A.length == 0) return new int[] {-1};
        
        int s = 0;
        int e =0;
        int sum = A[0];
        
        for(int i=1;i<A.length;i++){
            if(sum < B) sum += A[i];
            
            while(sum > B){
                sum -= A[s];
                s++;
            }
            
            if(sum == B){
              e = i;
              break;
            }
        }
        
        if (e == 0) return new int[] {-1};
        
        int[] output = new int[e-s+1];
        int x = 0;
        for(int j=s;j<=e;j++){
            
            output[x] = A[j];
            x++;
        }
        
        return output;
        
    }
}
