class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        List<Integer> soln = new ArrayList<>();
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else
                i++;
        }
        i = 0;
        for( ; i < arr.length; i++){
            if(arr[i] != i + 1)
                soln.add(arr[i]);
        }
        return soln;
    }
}