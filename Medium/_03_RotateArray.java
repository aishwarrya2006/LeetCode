class Solution {
    public void rotate(int[] nums, int k) 
    {
        int n = nums.length;

        if(n <=k && k%n == 0)
        {
            return;
        }

        for(int i = 0; i<n/2; i++)
        {
            int temp = nums[i];
            nums[i] = nums[n-i-1];
            nums[n-i-1] = temp;
        }

        int p = (k-1)%n;
        int j = 0;
        while(j<=p)
        {
            int temp = nums[p];
            nums[p] = nums[j];
            nums[j] = temp;
            j++; p--;
        }


        int q = k%n;
        int t = n-1;
        while(q<=t)
        {
            int temp = nums[q];
            nums[q] = nums[t];
            nums[t] = temp;
            t--; q++;
        }



    }
}