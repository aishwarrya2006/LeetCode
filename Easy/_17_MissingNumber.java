import java.util.*;
class Solution {
    public int missingNumber(int[] nums) 
    {
        int n = nums.length;
        boolean vis[] = new boolean[n+1];

        for(int i =0; i<n; i++)
        {
            vis[nums[i]] = true;
        }

        for(int i =0; i<vis.length; i++)
        {
            if(!vis[i])
            {
                return i;
            }
        }
        return -1;
    }
}