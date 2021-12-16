import java.util.HashSet;

public class LongestConsecutiveSequence {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int longestConsecutive(final int[] A) {

        HashSet<Integer> hs = new HashSet<Integer>();
        for (int count = 0; count < A.length; count++) {
            hs.add(A[count]);
        }
        int max_length = 0;
        int length = 0;

        for (int i : hs) {
            if (!hs.contains(i - 1)) {
                int a = i + 1;
                length = 1;
                while (hs.contains(a)) {
                    length++;
                    a++;
                }

                if (max_length < length) {
                    max_length = length;
                }
            }
        }

        return max_length;
    }
}
