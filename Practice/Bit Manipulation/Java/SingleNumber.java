import java.util.List;
import java.util.ArrayList;
public class SingleNumber {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<Integer>(List.of(1,1,2,2,3,3,4));
        SingleNumber sn = new SingleNumber();
        System.out.println(sn.singleNumber(A));
    }
    public int singleNumber(final List<Integer> A) {
        int ans = 0;
        for(int i=0;i<A.size();i++){
            ans ^= A.get(i);
        }

        return ans;
    }
}
