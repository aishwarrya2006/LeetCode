class Solution {
    public boolean isPalindrome(int x) 
    {
        if(reverse(x) == x)
        {
            return true;
        }
        return false;
    }

    public int reverse(int x)
    {
        int rev = 0;
        int div;
        while(x>0)
        {
            div = x%10;
            rev = rev*10+div;
            x = x/10;
        }
        return rev;
    }
}
