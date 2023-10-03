class Solution {
    public int largestPerimeter(int[] nums) 
    {
        Arrays.sort(nums);

            int i=nums.length-1,j=nums.length-2,k=nums.length-3;

            while(k>=0){
            if(nums[k]+nums[j]>nums[i])
            return nums[i]+nums[j]+nums[k];
            else
            {
                i--;j--;k--;
            }
            }
        
        return 0;
    }
}