class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int m=arr1.length;
        int n=arr2.length;
        double median;
        int i=0;
        int j=0;
        int ans[]=new int[m+n];
        int k=0;
        // merge two array in sorted manner
        while(i<m && j<n)
        {
            if(arr1[i]<=arr2[j])
            ans[k++]=arr1[i++];
            else
            ans[k++]=arr2[j++];
        }
        while(i<m)
           ans[k++]=arr1[i++];  
        
        while(j<n)
           ans[k++]=arr2[j++];  
        
       

        // find median of two number
        // case 1--> odd length
        int l=ans.length;
        
        if(l%2!=0)
        {
            int index=(ans.length+1)/2;
            index=index-1;
            median=(double)ans[index];
        }
        // case 2 --> even length
        else {
            int index=(ans.length)/2;
             int sum=ans[index]+ans[index-1];
            median=(double)sum/(double)2;
          }
          
        return median;
    }
}