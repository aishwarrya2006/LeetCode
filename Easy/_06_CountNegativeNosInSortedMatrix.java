class Solution {
    public int countNegatives(int[][] grid) 
    {
        int result =0;
        int sol=0;
        int row = grid.length;
        int col = grid[0].length;
        for(int i = 0; i<row; i++)
        {
            result =  binary(grid, 0, col-1, i);
            sol = sol + (col -result);
        }
        return sol;
    }

    public int binary(int grid[][], int low, int high, int i)
    {
        int mid =0;
        int ans = high+1;
        while(low<=high)
        {
            mid = (low+high)/2;
            if(grid[i][mid] >= 0)
            {
                low = mid+1;
            }
            else
            {
                ans = mid;
                high = mid-1;
            }
        }
        return ans;

    }

        
}