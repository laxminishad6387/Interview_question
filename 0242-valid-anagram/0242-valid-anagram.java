// solve using String approch
class Solution {
    public String helper(String s)
    {
         char s1[]=s.toCharArray();
         Arrays.sort(s1);
         return new String(s1);
    }
    public boolean isAnagram(String s, String p) {
      String s1= helper(s);
      String p1= helper(p);
        if(s1.length()!=p1.length())
        return false;
        for(int i=0; i<s1.length(); i++)
        {
            if(s1.charAt(i)!=p1.charAt(i))
              return false;
        }
        return true;

    }
}