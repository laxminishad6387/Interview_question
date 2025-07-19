class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0; int j=0; int k=0;
        int result[]=new int[nums1.length+nums2.length];
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<=nums2[j])
             result[k++]=nums1[i++];
            
            else
            result[k++]=nums2[j++];
        }
         while(i<nums1.length )
            result[k++]=nums1[i++];
        
         while(j<nums2.length)
           result[k++]=nums2[j++];
        

        for(int l=0; l<result.length; l++)
        {
            System.out.print(result[l]+" ");
        }
        if(result.length%2==0)
        {
            int mid=result.length/2;
            double median=(double)(result[mid-1]+result[mid])/2;
            return median;
        }
        else{
            double median=result[result.length/2];
            return median;
        }
       
    }

}