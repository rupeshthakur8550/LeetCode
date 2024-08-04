class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += nums[j];
                arr.add(sum);
            }
        }
        int sum = 0;
        arr.sort(Comparator.naturalOrder());
        for(int i = left - 1; i < right; i++){
            sum = (sum + arr.get(i)) % 1000000007;
        }
        return sum;
    }
}