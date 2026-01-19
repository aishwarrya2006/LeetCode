class Solution {
    public void rotate(int[][] matrix) 
    {
        int n = matrix[0].length;
        int N = n;
        for(int i =0; i<n; i++)
        {
            for(int j =0; j<n; j++)
            {
                if(j>i)
                {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;

                }
            }
        }

        for(int k = 0; k<n; k++)
        {
            reverse(matrix[k]);
        }
    }

    public void reverse(int[] nums)
    {
        int i = 0;
        int j = nums.length-1;
        while(i<j)
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++; j--;
        }
    }
}