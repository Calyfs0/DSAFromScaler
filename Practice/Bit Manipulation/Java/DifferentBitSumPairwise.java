import java.util.*;
public class DifferentBitSumPairwise {

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1,3,5));
        DifferentBitSumPairwise differentBitSumPairwise = new DifferentBitSumPairwise();
        System.out.println(differentBitSumPairwise.countBits(A));
    }

    public int countBits(ArrayList<Integer> A){
        long finalSum = 0;
        int mod = 1000000007;
        int arraySize = A.size();
        for(int i=0;i<32;i++){
            int count = 0;
            for(int j=0;j<arraySize;j++){
                if((A.get(j) & (1<<i)) > 0){
                    count++;
                }
            }

            finalSum += (long)2 * count * (arraySize - count);
            finalSum %= mod;
        }

        return (int)finalSum;
    }
    
}
