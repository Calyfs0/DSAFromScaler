public class FindTargetIndicesAfterSorting {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> output = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                output.add(i);
            }
        }

        return output;
    }

}
