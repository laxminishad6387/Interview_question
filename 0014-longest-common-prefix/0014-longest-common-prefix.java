class Solution {
    public String longestCommonPrefix(String[] arr) {
        if(arr.length<=1)
         return arr[0];
        StringBuilder str=new StringBuilder();
         str.append(arr[0]);
        for(int i=1; i<arr.length; i++)
        {
             StringBuilder result=new StringBuilder();
             for(int j=0; j<arr[i].length(); j++)
             {
                if(j<str.length())
                {
               
                  if(str.charAt(j)!=arr[i].charAt(j))
                  break;
                  result.append(arr[i].charAt(j));
                }
             }
             str=result;
        }
        return str.toString();
    }
}