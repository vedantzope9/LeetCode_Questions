class Solution {
    int func(int a)
    {
        int ans=0;
        while(a!=0)
        {
            int d=a%10;
            ans=ans+(d*d);
            a=a/10;
        }
        return ans;
    }

    public boolean isHappy(int n)
    {
        int slow=n, fast=n;

        do{
            slow=func(slow);
            fast=func(func(fast));

        }while(slow!=fast);
        
        if(slow==1)
        return true;

        return false;
    }
}