import java.util.ArrayList;

public class AllocateBooks {
    private ArrayList<Integer> A;
    private int B;

    public AllocateBooks(ArrayList<Integer> A, int B) {
        this.A = A;
        this.B = B;
    }

    public int books() {
        if (B > A.size())
            return -1;
        int start = Integer.MAX_VALUE;
        int end = 0;

        for (int i = 0; i < A.size(); i++) {
            int currentValue = A.get(i);
            if (currentValue < start) {
                start = currentValue;
            }
            end += currentValue;
        }

        while (start <= end) {

            int mid = (start + end) / 2;
            int noOfStudents = 1;
            int currentSum = 0;
            for (int i = 0; i < A.size(); i++) {
                currentSum += A.get(i);
                if (currentSum > mid) {
                    noOfStudents++;
                    currentSum = A.get(i);
                }

            }

            if (noOfStudents > B) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return start;
    }
}
