class Solution {
    public int[] twoSum(int[] nums, int target)
    {
        int arr[]=Arrays.copyOf(nums,nums.length);

         Arrays.sort(nums);
         int i=0,j=nums.length-1,flg=0,m=-1,n=-1,p=0,q=0;

         while(j>i)
         {
             if(nums[i]+nums[j] == target)
             {
                 flg=1;
                 p=nums[i];
                 q=nums[j];

                 break;
             }
            else if(nums[i]+nums[j] > target)
             j--;

            else if(nums[i]+nums[j] < target)
             i++;
         }

        if(flg==1)
        {
            for(i=0;i<nums.length;i++)
            {
                if(m==-1 && arr[i]==p)
                m=i;

                else if( n==-1 && arr[i]==q)
                n=i;
            }
             return new int[]{m,n};
        }
         return new int[]{-1,-1};
    }
}