import java.util.HashSet;

public class FindDuplicates {
    static int FindNumberOfDuplicates() {
        int[] A = {1, 2, 3};

        HashSet<Integer> s = new HashSet<>();
        int count = 0;
        for (int i : A) {
            if (s.contains(i)) {
                count++;
            } else {
                s.add(i);
            }
        }

        return count;
    }
}
