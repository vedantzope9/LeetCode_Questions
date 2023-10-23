class Solution {
    public int minimumSum(int[] nums) 
    {
        int n=nums.length;
        int m1[]=new int[n];
        int m2[]=new int[n];
        
        m1[0]=nums[0];
        m2[n-1]=nums[n-1];

        for(int i=1;i<n;i++)
        m1[i]=Math.min(m1[i-1],nums[i]);

        for(int i=n-2;i>=0;i--)
        m2[i]=Math.min(m2[i+1],nums[i]);

        int ans=Integer.MAX_VALUE;

        for(int i=1;i<n-1;i++)
        {
            if(nums[i]>m1[i-1] && nums[i]> m2[i+1])
            ans=Math.min(ans,m1[i-1]+nums[i]+m2[i+1]);
        }
        if(ans==Integer.MAX_VALUE)
        return -1;
        
        return ans;
    }
}