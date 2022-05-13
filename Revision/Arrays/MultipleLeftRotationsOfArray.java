import java.util.ArrayList;

public class MultipleLeftRotationsOfArray {
    ArrayList<Integer> A;
    ArrayList<Integer> B;

    public MultipleLeftRotationsOfArray(ArrayList<Integer> A, ArrayList<Integer> B) {
        this.A = A;
        this.B = B;
    }

    public ArrayList<ArrayList<Integer>> DoRotations() {
        ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> rotatedInput = new ArrayList<Integer>(A);
        RotateArray(rotatedInput, 0, rotatedInput.size() - 1);

        for (int i = 0; i < B.size(); i++) {
            ArrayList<Integer> CopyRotatedInput = new ArrayList<Integer>(rotatedInput);
            int noOfRotations = B.get(i) % A.size();

            RotateArray(CopyRotatedInput, 0, A.size() - (noOfRotations + 1));
            RotateArray(CopyRotatedInput, A.size() - noOfRotations, A.size() - 1);

            output.add(CopyRotatedInput);
        }

        return output;

    }

    public void RotateArray(ArrayList<Integer> input, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            int temp = input.get(startIndex);
            input.set(startIndex, input.get(endIndex));
            input.set(endIndex, temp);
            startIndex++;
            endIndex--;
        }
    }

}
