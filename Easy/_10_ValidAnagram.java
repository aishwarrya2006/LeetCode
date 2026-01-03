import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) 
    {
        char[] s1 = s.toCharArray();
        Arrays.sort(s1);
        String s2 = new String(s1);
        char[] t1 = t.toCharArray();
        Arrays.sort(t1);
        String t2 = new String(t1);

        if(t2.equals(s2))
        {
            return true;
        }

        return false;

    }
}