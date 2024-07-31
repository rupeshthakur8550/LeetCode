class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0, temp = 0;
        for(int val : nums){
            total += val;
        }
        for(int i = 0; i < nums.length; i++){
            total -= nums[i];
            if(total == temp){
                return i;
            }
            temp += nums[i];
        }  
        return -1;
    }
}