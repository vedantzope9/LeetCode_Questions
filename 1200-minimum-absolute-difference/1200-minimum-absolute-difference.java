class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr)
    {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        //List<Integer> list= new ArrayList<Integer>();
        int r=0;

        int d=Math.abs(arr[1]-arr[0]);
        for(int i=0;i<arr.length-1;i++)
        {
            if(Math.abs(arr[i+1]-arr[i])< d)
            d=Math.abs(arr[i+1]-arr[i]);
        }

        for(int i=0;i<arr.length-1;i++)
        {
           
                if(Math.abs(arr[i+1]-arr[i])==d)
                {
                    List<Integer> list= new ArrayList<Integer>();
                    list.add(arr[i]);
                    list.add(arr[i+1]);
                    ans.add(list);
                 
                }

        }
        return ans;
    }
}