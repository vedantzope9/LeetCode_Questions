class Solution {
    public String defangIPaddr(String address)
    {
        StringBuilder str=new StringBuilder(address);

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='.')
            {
                str.replace(i,i+1,"[.]");
                i=i+2;
            }
        }
        String string=new String(str);
        return string;
    }
}