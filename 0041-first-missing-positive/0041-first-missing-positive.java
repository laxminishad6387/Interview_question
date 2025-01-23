class Solution {
    public int firstMissingPositive(int[] arr) {
       int  temp[]=new int[arr.length];
       for(int i=0; i<arr.length; i++)
       {
          int index=arr[i];
          index=index-1;
          if(index>arr.length-1)
           continue;
           else if(index<0)
            continue;
            else 
            temp[index]=arr[i];
       } 
       for(int i=0; i<temp.length; i++)
       {
        if(temp[i]!=i+1)
          return i+1;
       }
       return temp.length+1;
    }
}