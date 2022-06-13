public class DistributeCandies{
    public int candy(int[] A) {
        int[] candies = new int[A.length];
        candies[0] = 1;
        for(int i=1;i<A.length;i++){
            candies[i] = 1;
            if(A[i]>A[i-1]){
                candies[i] = candies[i-1] + 1;
            }
        }

        for(int i=A.length -2;i>=0;i--){
            if(A[i] > A[i+1] && candies[i]<=candies[i+1]){
                candies[i] = candies[i+1] + 1;
            }
        }
        int totalCandies = 0;
        for(int i=0;i<candies.length;i++){
            totalCandies += candies[i];
        }

        return totalCandies;
    }
}