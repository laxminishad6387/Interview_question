// solve using HashMap Function

class Solution {
    int maxlength=0;
  
    public void helper(String s,int row)
    {
        if(s.length()==row)
         return;
        HashMap<Character, Integer> map=new HashMap<>();
       
          int currlength=0;
        for(int i=row; i<s.length(); i++)
        {
            if(map.containsKey(s.charAt(i)))
             break;
              else
              {
              map.put(s.charAt(i),1);
                currlength++;
              }
        }
        maxlength=Math.max(maxlength, currlength);
        helper(s,row+1);
    }
    public int lengthOfLongestSubstring(String s) {
     
       helper(s,0);
       return maxlength;
    }
}