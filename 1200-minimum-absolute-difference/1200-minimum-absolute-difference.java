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
           
            for(int j=i+1;j<arr.length;j++)
            {
                if(Math.abs(arr[j]-arr[i])==d)
                {
                    List<Integer> list= new ArrayList<Integer>();
                    list.add(arr[i]);
                    list.add(arr[j]);
                    ans.add(list);
                 
                }

                if(Math.abs(arr[j]-arr[i])>d)
                break;
            }

           // if(flg==1){
               // ans.add(list);
                //r++;
               
           // }
        }
        return ans;
    }
}