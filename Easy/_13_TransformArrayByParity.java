class Solution {
    public int[] transformArray(int[] nums) 
    {
        int n = nums.length;
        int count0 = 0;
        int ans[] = new int[n];
        for(int i = 0; i<n; i++)
        {
            if(nums[i]%2 == 0)
            {
                nums[i] = 0;
                count0++;
            }
            else
            {
                nums[i] = 1;
            }
        }

        for(int j=0; j<count0; j++)
        {
            ans[j] = 0;
        }
        for(int k=count0; k<n; k++)
        {
            ans[k] = 1;
        }
        return ans;
    }
}