import java.util.*;

public class InterestingArray {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(9,17));
        InterestingArray ia = new InterestingArray();
        System.out.println(ia.solve(A));
    }
    public String solve(ArrayList<Integer> A) {
        int xorValue = 0;

        for(int i=0;i<A.size();i++){
            xorValue ^= A.get(i);
        }

        if(xorValue%2 == 0) return "Yes";
        return "No";
    }
    
}
