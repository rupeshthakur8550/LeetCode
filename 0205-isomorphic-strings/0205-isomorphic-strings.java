class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map map = new HashMap();
        for (Integer i=0; i<s.length(); ++i)
            if (map.put(s.charAt(i), i) != map.put(t.charAt(i)+"", i))
                return false;
        System.gc();
        return true;
    }
}