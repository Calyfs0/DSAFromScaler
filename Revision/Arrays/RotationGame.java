public class RotationGame {
    int[] A;
    int B;

    public RotationGame(int[] A, int B) {
        this.A = A;
        this.B = B;
    }

    public void RotateArray() {

        int startIndex = A.length - (B % A.length);
        for (int i = startIndex, j = 0; j < A.length; j++, i++) {
            System.out.print(A[i % A.length] + " ");
        }

    }

}
