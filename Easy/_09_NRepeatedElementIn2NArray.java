class Solution {
    public int repeatedNTimes(int[] nums) 
    {
        int N = nums.length;
        int n = N/2;
        int ans =0;
        for(int i = 0; i<N-1; i++)
        {
            int count = 1;
            for(int j = i+1; j<N; j++)
            {
                if(nums[i] == nums[j])
                {
                    count++;
                }
            }
            
            if(count == n)
            {
                ans = nums[i];
            }
        }
        return ans;
    }
}