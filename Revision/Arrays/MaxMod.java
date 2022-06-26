import java.util.ArrayList;
import java.util.Collections;

public class MaxMod {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int maxMod = Integer.MIN_VALUE;
        for(int i=1;i<A.size();i++){
            if(A.get(i) == 0) continue;
            int val = A.get(i-1)%A.get(i);
            maxMod = Math.max(maxMod,val);
        }

        return maxMod;
    }
}
