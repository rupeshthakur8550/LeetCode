class Solution {
    public int[] sortArray(int[] nums) {
    quickSort(nums, 0, nums.length - 1); 
    return nums;
}

private void quickSort(int[] nums, int start, int end) {
    if (start >= end) {
        return; 
    }
    int pivot = nums[start + (end - start) / 2];
    int left = start;
    int right = end;
    while (left <= right) {
        while (nums[left] < pivot) {
            left++;
        }
        while (nums[right] > pivot) {
            right--;
        }
        if (left <= right) {
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
    }

    quickSort(nums, start, right); 
    quickSort(nums, left, end);  
    }
}