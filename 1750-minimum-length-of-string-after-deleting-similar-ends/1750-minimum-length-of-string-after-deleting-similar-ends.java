class Solution {
    public int minimumLength(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        return calculateLength(s);
    }

    private int calculateLength(String check) {
        int start = 0, end = check.length() - 1;
        while (start < end && check.charAt(start) == check.charAt(end)) {
			char ch = check.charAt(start);
			while(start <= end && check.charAt(start) == ch) {
				start++;
			}
			while(start <= end && check.charAt(end) == ch) {
				end--;
			}
		}
        System.gc();
		return end - start + 1;
    }
}