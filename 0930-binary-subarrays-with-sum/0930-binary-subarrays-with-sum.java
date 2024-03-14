class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {    
        return calculateSubarrayCount(nums, goal) -  calculateSubarrayCount(nums, goal - 1);
    }
    private int calculateSubarrayCount(int[] nums, int goal){
        int start = 0, currentSum = 0, totalCount = 0;
        for(int i = 0; i < nums.length; i++){
            currentSum += nums[i];
            while(start <= i && currentSum > goal){
                currentSum -= nums[start++];
            }
            totalCount += i - start + 1;
        }
        return totalCount;
    }
}