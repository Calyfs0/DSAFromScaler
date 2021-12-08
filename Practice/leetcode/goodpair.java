import java.util.HashMap;

public class goodpair {
    public int numIdenticalPairs(int[] nums) {
        int gpCount = 0;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int n : nums) {
            int count_val = map.getOrDefault(n, 0);
            gpCount += count_val;
            map.put(n, count_val + 1);

        }

        return gpCount;
    }
}
