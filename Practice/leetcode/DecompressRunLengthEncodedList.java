import java.util.ArrayList;
import java.util.Arrays;

public class DecompressRunLengthEncodedList {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> output = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];

            while (freq > 0) {
                output.add(val);
                freq--;
            }
        }

        int[] arr = new int[output.size()];
        for (int k = 0; k < output.size(); k++) {
            arr[k] = output.get(k);
        }

        return arr;
    }

    // Optimized approach
    public int[] decompressRLElistOptimized(int[] nums) {
        int len = 0;
        for (int c = 0; c < nums.length; c += 2) {
            len += nums[c];
        }
        int[] arr = new int[len];
        int index = 0;
        for (int i = 0; i < nums.length; i += 2) {
            Arrays.fill(arr, index, index + nums[i], nums[i + 1]);
            index += nums[i];
        }

        return arr;
    }
}
