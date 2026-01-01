class Solution {
    public int divide(int dividend, int divisor) 
    {
        long q = 0;
        long dividend1 = Math.abs ((long)dividend);
        long divisor1 = Math.abs ((long)divisor);
        while(dividend1 >= divisor1)
        {
            int temp = 0;
            long newd = divisor1 << temp+1;
            while(newd <= dividend1)
            {
                temp++;
                newd = divisor1 << temp+1;
            }

            dividend1 = dividend1 - (divisor1 << temp);
            q += Math.pow(2, temp);
        }
        if((divisor<0) != (dividend < 0))
        {
            q = -q;
        }

        if(q > Integer.MAX_VALUE)
        {
            return Integer.MAX_VALUE;
        }
        else if(q < Integer.MIN_VALUE)
        {
            return Integer.MIN_VALUE;
        }


        return (int) q;
    }
}