public class RotationGameReversingTheArray {
    int[] A;
    int B;

    public RotationGameReversingTheArray(int[] A, int B) {
        this.A = A;
        this.B = B;
    }

    public void RotateArray() {
        Rotate(A, 0, A.length - 1);

        Rotate(A, 0, B - 1);

        Rotate(A, B, A.length - 1);

        System.out.println(A.toString());
    }

    public void Rotate(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        i++;
        j--;
    }
}
