import java.util.List;

public class LonelyInteger {

    public int FindLonelyInteger(List<Integer> a) {
        int output = 0;
        for (int x : a) {
            output = output ^ x;
        }
        return output;
    }

}