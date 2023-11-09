class Solution {
    public int countHomogenous(String s)
    {
        int sum=0,c=1;

        for(int i=0;i<s.length();i++)
        {
            if(i==s.length()-1)
             sum=(int)((sum+((long)c*(c+1))/2) % ((int)((Math.pow(10,9))+7)));
            else if(Character.compare(s.charAt(i) , s.charAt(i+1))==0)
            {
                c++;
            }
            else
            {
                sum=(int)((sum+((long)c*(c+1))/2) % ((int)((Math.pow(10,9))+7)));
                c=1;
            }
        }
        return sum;
    }
}