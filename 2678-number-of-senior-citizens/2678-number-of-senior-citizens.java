class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(String check:details){
            int age = Integer.parseInt(check.charAt(11)+""+check.charAt(12));
            if(age> 60){
                count++;
            }
        }
        return count;
    }
}