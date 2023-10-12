class Solution {
    public int threeSumClosest(int[] nums, int target)
    {
        Arrays.sort(nums);
        int sum=0, minsum=nums[0]+nums[1]+nums[2];
        
        for(int i=0;i<nums.length;i++)
        {
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                sum=nums[i]+nums[j]+nums[k];
                if(Math.abs(target-sum)<Math.abs(target-minsum))
                minsum=sum;
                if(sum==target)
                return sum;

                else if(sum<target)
                j++;

                else
                k--;
            }
            
        }
        return minsum;
    }
}