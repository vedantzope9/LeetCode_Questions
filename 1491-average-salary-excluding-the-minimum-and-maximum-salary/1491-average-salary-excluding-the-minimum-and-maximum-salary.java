class Solution {

    public double average(int[] salary)
    {
        double ans=0,sum=0;
        Arrays.sort(salary);

        for(int i=1;i<salary.length-1;i++)
        sum=sum+salary[i];

        ans=sum/(salary.length-2);
        return ans;
    }
}