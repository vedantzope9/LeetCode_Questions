class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums)
    {
        int arr[]=Arrays.copyOf(nums,nums.length);
        Arrays.sort(arr);

        HashMap<Integer,Integer> map = new HashMap<>();
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(arr[i]))
            map.put(arr[i],k);

            k++;
        }

        for(int i=0;i<nums.length;i++)
        {
            arr[i]=map.get(nums[i]);
        }
        return arr;
    }
}