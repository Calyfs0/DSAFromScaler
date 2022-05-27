import java.util.*;

public class MinimumXORValue {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(4,7,0,9));
        MinimumXORValue mxv = new MinimumXORValue();
        System.out.println(mxv.findMinXor(A));
    }
    public int findMinXor(ArrayList<Integer> A) {
        Collections.sort(A);

        int min = Integer.MAX_VALUE;

        for(int i=1;i<A.size();i++){
            min = Math.min(A.get(i)^A.get(i-1),min);
        }

        return min;
    }    
}
