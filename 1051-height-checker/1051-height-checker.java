class Solution {
    public int heightChecker(int[] heights) 
    {
        int ex[]=new int[heights.length];

        for(int i=0;i<heights.length;i++)
            ex[i]=heights[i];

        Arrays.sort(heights);
        int c=0;
        for(int i=0;i<heights.length;i++)
        {
            if(heights[i]!=ex[i])
            c++;
        }
        return c;
    }
}