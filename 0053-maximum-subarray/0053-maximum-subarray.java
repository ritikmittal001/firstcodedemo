class Solution {
    public int maxSubArray(int[] nums) {
        int currentsum=nums[0];
        int maxsum=nums[0];
        for(int i=1;i<nums.length;i++){
            currentsum=Math.max(nums[i],nums[i]+currentsum);
            maxsum=Math.max(currentsum,maxsum);
        }
        return maxsum;
    }
}