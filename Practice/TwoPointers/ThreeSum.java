import java.util.*;
class ThreeSum{
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(5, -2, -1, -10, 10));
        int B = 5;
        ThreeSum threeSum = new ThreeSum();
        System.out.println(threeSum.threeSumClosest(A, B));
    }

    public int threeSumClosest(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        long ans = Integer.MAX_VALUE;

        for(int i=0;i<=A.size() - 3;i++){
            int j = i+1;
            int k = A.size() - 1;

            while(j<k){
                long currentSum = (long)A.get(i) + A.get(j) + A.get(k);
                if(currentSum == B) return B;
                if(Math.abs(currentSum - B) < Math.abs(ans - B)){
                    ans = currentSum;
                }

                if(currentSum > B){
                    k--;
                }
                else{
                    j++;
                }
            }
        }

        return (int)ans;
    }
}