class Solution {
    public String freqAlphabets(String s)
    {
        StringBuilder sb=new StringBuilder(s);

        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)=='#')
            {
                int d=Integer.parseInt(sb.substring(i-2,i));
                sb.replace(i-2,i+1, String.valueOf((char)(d+96)));
                i=i-2;
            }
        }

        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)>=49 && sb.charAt(i)<=57)
            {
                int d=Integer.parseInt(String.valueOf(sb.charAt(i)));
                sb.replace(i,i+1, String.valueOf((char)(d+96)));
            }
        }
        String str=new String(sb);
        return str;
    }
}