class Solution {
    public void nextPermutation(int[] arr) {
        int gola_index=-1;
        for(int i=arr.length-1; i>0; i--)
        {
            if(arr[i]>arr[i-1])
            {
                gola_index=i-1;
                break;
            }
        }
        int greater_index=gola_index;
        if(gola_index!=-1)
        {
            for(int i=arr.length-1; i>0; i--)
            {
                if(arr[i]>arr[gola_index])
                {
                  greater_index=i;
                  break;
                }
            }
            int temp=arr[gola_index];
            arr[gola_index]=arr[greater_index];
            arr[greater_index]=temp;
        }
        int j=0;
        for(int i=gola_index+1; i<=(gola_index+arr.length)/2; i++)
        {
            int temp=arr[i];
            arr[i]=arr[arr.length-1-j];
            arr[arr.length-1-j]=temp;
            j++;
        }
    }
}