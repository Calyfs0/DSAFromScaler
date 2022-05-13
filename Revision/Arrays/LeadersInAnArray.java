import java.util.ArrayList;

public class LeadersInAnArray {
    ArrayList<Integer> A;

    public LeadersInAnArray(ArrayList<Integer> inputArray) {
        this.A = inputArray;
    }

    public ArrayList<Integer> FindLeadersInArray() {
        ArrayList<Integer> output = new ArrayList<Integer>();
        int currentMax = A.get(A.size() - 1);
        output.add(currentMax);

        for (int i = A.size() - 2; i >= 0; i--) {
            int currentValue = A.get(i);
            if (currentValue > currentMax) {
                output.add(currentValue);
                currentMax = currentValue;
            }
        }

        return output;
    }
}
