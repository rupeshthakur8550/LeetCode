class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length; // number of rows
        int n = matrix[0].length; // number of columns
        int maxCols[] = new int[n]; // array to store max values of each column
        List<Integer> res = new ArrayList<>(); // list to store lucky numbers
        
        // Find max value in each column
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maxCols[i] = Math.max(maxCols[i], matrix[j][i]);
            }
        }

        // Find min value in each row and check if it is also the max in its column
        for (int i = 0; i < m; i++) {
            int minRow = matrix[i][0];
            int colIndex = 0;
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < minRow) {
                    minRow = matrix[i][j];
                    colIndex = j;
                }
            }
            if (minRow == maxCols[colIndex]) {
                res.add(minRow);
            }
        }
        System.gc();
        return res;
    }
}