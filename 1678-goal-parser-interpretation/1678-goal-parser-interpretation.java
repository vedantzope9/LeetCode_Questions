class Solution {
    public String interpret(String command)
    {
        StringBuilder str=new StringBuilder(command);
        int i=0;
        while(i<str.length()-1)
        {
            if(str.charAt(i)=='(' && str.charAt(i+1)==')')
            {
                str.replace(i,i+2,"o");
            }
            else if(str.charAt(i)=='(' && str.charAt(i+1)=='a')
            {
                if(str.charAt(i+2)=='l' && str.charAt(i+3)==')'){
                str.replace(i,i+4,"al");
                i=i+1;
                }
            }

           i++;
        }
        String s=new String(str);

        return s;
    }
}