class Solution {
//     void quicksort(int arr[],int low,int high)   
//     {
//         if(low>=high)
//         return;

//         int start=low,end=high;
//         int mid=start+(end-start)/2;
//         int pivot=arr[mid];

//         while(start<=end)
//         {
//             while(arr[start]<pivot)
//             start++;
//             while(arr[end]>pivot)
//             end--;

//             if(start<=end)
//             {
//                 int temp=arr[start];
//                 arr[start]=arr[end];
//                 arr[end]=temp;
//                 start++;
//                 end--;
//             }
//         }
//         quicksort(arr,low,end);
//         quicksort(arr,start,high);
//     }
    public int[] sortedSquares(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=nums[i]*nums[i];
        }
        
        //quicksort(nums,0,nums.length-1);
        Arrays.sort(nums);
        return nums;
    }
}