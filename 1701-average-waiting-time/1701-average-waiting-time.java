class Solution {
    public double averageWaitingTime(int[][] customers) {
        int total_time = 0;
        double ans = 0;
        for(int i = 0 ; i < customers.length; i++){
            total_time = i == 0 || total_time < customers[i][0] ? customers[i][0] + customers[i][1] :total_time + customers[i][1];
            ans += total_time - customers[i][0];
        }
        return ans / customers.length;
    }
}