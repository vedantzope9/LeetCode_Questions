class Solution {
    public int[] getConcatenation(int[] nums)
    {
        int n=nums.length;
        int arr[]=new int[2*n];
        int j=0;
        for(int i=0;i<2*n;i++)
        {
            if(i>=nums.length)
            {
                arr[i]=nums[j];
                j++;
            }
            else
            arr[i]=nums[i];
        }
        return arr;
    }
}