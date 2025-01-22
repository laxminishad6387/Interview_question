class Solution {
    public int removeDuplicates(int[] arr) {
        // base condtion
        if(arr.length==1)
          return 1;
          int j=0;
          for(int i=1; i<arr.length; i++)
          {
            if(arr[i]!=arr[j]) // two indices value are not equal
            arr[++j]=arr[i];  //first increment the j index than put the value
          }
          return j+1;
    }
}