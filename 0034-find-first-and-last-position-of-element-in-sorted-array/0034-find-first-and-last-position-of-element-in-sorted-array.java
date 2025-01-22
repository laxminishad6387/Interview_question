class Solution {
    public int leftsol(int []arr,int low,int high,int target)
    {
       int  res=-1; 
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target)
            {
              res=mid;
              high=mid-1;

            }
            else if(arr[mid]<target)
             low=mid+1;
             else
              high=mid-1;
        }
       return res; 
    }
     public int rightsol(int []arr,int low,int high,int target)
    {
      int res=-1;
        
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target)
            {
              res=mid;
               low=mid+1;
            }
            else if(arr[mid]<target)
             low=mid+1;
             else
              high=mid-1;
        }
       return res;  
    }
    public int[] searchRange(int[] arr, int target) {
       int ans[]=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        int low=0;
        int high=arr.length-1;
        ans[0]=leftsol(arr,low, high,target);
        ans[1]=rightsol(arr,low,high,target);
        return ans;
        
    }
}