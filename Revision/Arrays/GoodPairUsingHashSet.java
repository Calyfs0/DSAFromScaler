import java.util.HashSet;

public class GoodPairUsingHashSet{
    public int GoodPair(int[] A, int B){
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i =0;i<A.length;i++){
            if(hs.contains(B-A[i])) return 1;
            hs.add(A[i]);
        }
        return 0;
    }
}