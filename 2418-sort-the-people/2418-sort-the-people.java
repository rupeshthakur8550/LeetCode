class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i = 0; i < heights.length - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if(heights[j] > heights[j - 1]){
                    int temp = heights[j];
                    heights[j] = heights[j - 1];
                    heights[j - 1] = temp;
                    String swap = names[j];
                    names[j] = names[j - 1];
                    names[j - 1] = swap;
                }else{
                    break;
                }
            }
        }
        return names;
    }
}