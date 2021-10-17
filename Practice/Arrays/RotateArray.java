public class RotateArray {

    public RotateArray(int[] A, int B) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[(A.length + i - B) % A.length] + " ");
        }
    }
}

