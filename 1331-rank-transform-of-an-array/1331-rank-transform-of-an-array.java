class Solution {
    public int[] arrayRankTransform(int[] arr)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[]array=Arrays.copyOf(arr,arr.length);
        Arrays.sort(array);
        int k=1;
        for(int i=0;i<array.length;i++)
        {
            if(!map.containsKey(array[i]))
            map.put(array[i],k++);
        }
        int[]ans=new int[arr.length];

        for(int i=0;i<arr.length;i++)
        ans[i]=map.get(arr[i]);

        return ans;
    }
}