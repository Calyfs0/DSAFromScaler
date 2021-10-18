public class countofSmallNumberThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > max) max = nums[i];
        }
        
        int[] bag = new int[max+1];
        
        for(int j = 0;j<nums.length;j++){
            bag[nums[j]] += 1; 
        }
        
        for(int k =1; k<=max;k++){
            bag[k] += bag[k-1];
        }
        
        for(int l=0;l<nums.length;l++){
            int pos = nums[l];
            nums[l] = pos == 0 ? 0: bag[pos-1];
        }
        
        return nums;
    }
}
