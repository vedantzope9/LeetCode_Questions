class Solution {
    public int[][] generateMatrix(int n)
    {
        int arr[][]=new int[n][n];
        int left=0,right=n-1,top=0,bottom=n-1;
        int c=0;
        while(left<=right && top<=bottom)
        {
            for(int i=left;i<=right;i++)
            arr[top][i]= ++c;

            top++;

            for(int i=top;i<=bottom;i++)
            arr[i][right]=++c;
            
            right--;

            if(left<=right)
            {
                for(int i=right;i>=left;i--)
                arr[bottom][i]= ++c;

                bottom--;
            }

            if(top<=bottom)
            {
                for(int i=bottom;i>=top;i--)
                arr[i][left]=++c;

                left++;
            }
        }
        return arr;
    }
}