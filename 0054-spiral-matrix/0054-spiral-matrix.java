class Solution {
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        List<Integer>list=new ArrayList<>();
        int left=0, right=matrix[0].length-1, top=0, bottom=matrix.length-1;

        while(left<=right && top<=bottom)
        {
            for(int i=left;i<=right;i++)  //right
            list.add(matrix[top][i]);

            top++;

            for(int i=top;i<=bottom;i++) //down
            list.add(matrix[i][right]);

            right--;

        if(top<=bottom)
        {
            for(int i=right;i>=left;i--)  //left
            list.add(matrix[bottom][i]);

            bottom--;
        }
        if(left<=right)  //up
        {
            for(int i=bottom;i>=top;i--)
            list.add(matrix[i][left]);

            left++;
        }

        }
        return list;
    }
}