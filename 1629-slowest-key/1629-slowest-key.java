class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int maxTime = releaseTimes[0];  
        char ch = keysPressed.charAt(0);
        for(int i = 1; i < releaseTimes.length; i++){
            int diff = releaseTimes[i] - releaseTimes[i - 1];
            if(diff > maxTime || (diff == maxTime && keysPressed.charAt(i) > ch)){
                maxTime = diff;
                ch = keysPressed.charAt(i);
            }
        }
        return ch; 
    }
}