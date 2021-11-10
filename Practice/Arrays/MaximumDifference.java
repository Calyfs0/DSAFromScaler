public class Solution {
    public int solve(int[] A, int B) {
        Arrays.sort(A);
        
        int min_s1=0, min_s2=0, max_s1=0, max_s2=0, total_sum = 0;

        for(int x: A){
            total_sum += x;
        }

        for(int i=0;i<B;i++){
            min_s1 += A[i];
        }

        min_s2 = total_sum - min_s1;

        for(int j=A.length -1;j>A.length-1-B;j--){
            max_s1 += A[j];
        }

        max_s2 = total_sum - max_s1;
        return Math.max(Math.abs(max_s1 - max_s2), Math.abs(min_s1 - min_s2));

        

        

    }
}
