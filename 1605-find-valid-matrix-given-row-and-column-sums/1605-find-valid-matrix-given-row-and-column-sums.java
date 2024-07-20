class Solution {
     public int[][] restoreMatrix(int[] row, int[] col) {
        int m = row.length;
        int n = col.length;
        int[][] a = new int[m][n];
        int i = m-1;
        int j = n-1;
        while(i >= 0 && j >= 0){
            if(row[i] <= col[j]){
                a[i][j] = row[i];
                col[j] -= row[i];
                i--;
            }
            else {
                a[i][j] = col[j];
                row[i] -= col[j];
                j--;
            }
        }
         System.gc();
        return a;
    }
}