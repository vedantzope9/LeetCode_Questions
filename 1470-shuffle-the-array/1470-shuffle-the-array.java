class Solution {
    public int[] shuffle(int[] nums, int n)
    {
        int arr[]=new int[2*n];
        int k=0,l=n;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                arr[i]=nums[k];
                k++;
            }
            else
            {
                arr[i]=nums[l];
                l++;
            }
            
        }
        return arr;
    }
}