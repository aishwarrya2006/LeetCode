import java.util.*;
class Solution {
    public int reverse(int x) 
    {
        int div;
        long rev = 0;
        int ans;
        if(x>=0)
        {
            while(x>0)    
            {
                div = x%10;
                rev = rev*10+div;
                x =x/10;
            }
        }
        else
        {
            while(x<0)    
            {
                div = x%10;
                rev = rev*10+div;
                x =x/10;

            }
        }

        if((rev > Integer.MAX_VALUE || rev< Integer.MIN_VALUE))
        {
            return 0;
        }
        ans = (int)rev;

        return ans;
    }
}