class Solution {
    public boolean isAnagram(String s, String t) {
        // anagram: we compare two string . if both string contain the same charcter in same index than we  called a anaggram
        s=s.toLowerCase();
        t=t.toLowerCase();
       char str1[]=s.toCharArray();
       char str2[]=t.toCharArray();
       Arrays.sort(str1);
       Arrays.sort(str2);
       if(str1.length!=str2.length)
         return false;
         else{
       for(int i=0; i<str1.length; i++)
       {
        if(str1[i]!=str2[i])
          return false;
       }
         }
        return true;

    }
}