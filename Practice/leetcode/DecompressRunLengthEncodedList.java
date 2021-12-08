public class DecompressRunLengthEncodedList {
    ArrayList<Integer> output = new ArrayList<Integer>();

    for(
    int i = 0;i<nums.length;i+=2)
    {
        int freq = nums[i];
        int val = nums[i + 1];

        while (freq > 0) {
            output.add(val);
            freq--;
        }
    }

    int[] arr = new int[output.size()];for(
    int k = 0;k<output.size();k++)
    {
        arr[k] = output.get(k);
    }

    return arr;
}
