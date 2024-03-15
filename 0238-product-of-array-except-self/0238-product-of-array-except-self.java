class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] soln = new int[nums.length];
        int rightmul = 1, leftmul = 1;
        for (int i = 0; i < nums.length; i++) {
            soln[i] = leftmul;
            leftmul *= nums[i];
        }
        for (int i = nums.length -1; i >= 0; i--) {
            soln[i] *= rightmul;
            rightmul *= nums[i];
        }
        return soln;
    }
}