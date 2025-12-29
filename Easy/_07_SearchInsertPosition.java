class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        int ans = binarySearch(nums, target);
        return ans;
        
    }

    public int binarySearch(int nums[], int target)
    {
        int n = nums.length;
        int index = n/2;
        int low = 0;
        int high = n-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[mid] < target)
            {
                index += 1;
                low = mid+1;
            }
            else
            {
                index -= 1;
                high = mid-1;
            }
        }
        return low;


    }
}