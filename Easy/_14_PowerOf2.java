class Solution {
    public boolean isPowerOfTwo(int n) 
    {   

        if(n <= 0)
        {
            return false;
        }
        int count = 1;
        while((n & (n-1)) != 0)
        {
            n = n & (n-1);
            count++;
        }
        if(count == 1)
        {
            return true;
        }
        return false;
    }
}