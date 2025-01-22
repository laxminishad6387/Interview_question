class Solution {
    public int removeElement(int[] arr, int val) {
     //apply two pointer approch
     int j=0;
     for(int i=0; i<arr.length; i++)
     {
        if(arr[i]!=val)
         arr[j++]=arr[i];
     } 
     return j;
    }
}