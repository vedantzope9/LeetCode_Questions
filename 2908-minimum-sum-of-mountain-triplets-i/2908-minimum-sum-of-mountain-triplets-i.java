class Solution {
    
    public int minimumSum(int[] nums)
    {
        int m1[]=new int[nums.length];
        int m2[]=new int[nums.length];

        m1[0]=nums[0];
        m2[nums.length-1]=nums[nums.length-1];

        for(int i=1;i<nums.length;i++)
        {
            if(m1[i-1]>nums[i])
            m1[i]=nums[i];
            else
            m1[i]=m1[i-1];
        }

        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<m2[i+1])
            m2[i]=nums[i];
            else
            m2[i]=m2[i+1];
        }

        int ans=Integer.MAX_VALUE;

        for(int i=1;i<nums.length-1;i++)
        {
            if(nums[i]>m1[i-1] && nums[i]>m2[i+1])
            {
                ans=Math.min(ans,m1[i-1]+nums[i]+m2[i+1]);
            }
        }
        if(ans==Integer.MAX_VALUE)
        return -1;

        return ans;
    }
}