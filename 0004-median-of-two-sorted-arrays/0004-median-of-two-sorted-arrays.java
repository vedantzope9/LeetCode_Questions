class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
          int arr[]=new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,arr,0,nums1.length);
        System.arraycopy(nums2,0,arr,nums1.length,nums2.length);

        Arrays.sort(arr);
        if(arr.length % 2==0)
        {
            int mid=(arr.length-1) /2;
            float ans= ((float)arr[mid]+(float)arr[mid+1])/2;
            return ans;
        }
        else
        {
            int mid=(arr.length-1) / 2;
            return arr[mid];
        }

    }
}