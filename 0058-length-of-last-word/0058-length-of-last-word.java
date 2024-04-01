class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        s = s.trim();
        int len=s.length()-1;
        while(len>=0){
            if(s.charAt(len)!=' ')
                count++;
            else
                break;
            len--;
        }
        return count;
    }
}