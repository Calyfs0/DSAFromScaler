/*
Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation: 
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
*/

public class Solution {
    public int[] MaxSlidingWindow(int[] nums, int k) {
        int[] output = new int[nums.Length - k + 1];
            int index = 0;
            var dq = new LinkedList<int>();
            for (int i = 0; i < k; i++)
            {
                dq.AddLast(nums[i]);
                var curr = dq.Last;
                while (curr.Previous != null && curr.Previous.Value < curr.Value)
                {
                    dq.Remove(curr.Previous);
                }
            }
            output[index++] = dq.First.Value;

            for (int i = k; i < nums.Length; i++)
            {
                dq.AddLast(nums[i]);
                if (dq.First.Value == nums[i - k])
                {
                    dq.Remove(dq.First);
                }
                var curr = dq.Last;
                while (curr.Previous != null && curr.Previous.Value < curr.Value)
                {
                    dq.Remove(curr.Previous);
                }
                output[index++] = dq.First.Value;
            }

            return output;
    }
}