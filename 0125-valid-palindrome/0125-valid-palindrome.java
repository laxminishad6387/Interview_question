class Solution {
    public boolean isPalindrome(String s) {  
         //palindrome: if we read from left side or right side . we got  a same meaning or character from the both side
          s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
          for(int i=0; i<s.length()/2; i++)
          {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
               return false;
          }
          return true;

    }
}