class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
          char temp[]=s.toCharArray();
        for(int i=0; i<temp.length; i++)
        {
           if(st.empty() && (temp[i]==')' || temp[i]==']' || temp[i]=='}'))
            return false;
            else if(temp[i]=='(' || temp[i]=='[' || temp[i]=='{')
              st.push(temp[i]);
              else if(temp[i]==')' && st.peek()=='(')
                st.pop();
                 else if(temp[i]==']' && st.peek()=='[')
                st.pop();
                 else if(temp[i]=='}' && st.peek()=='{')
                st.pop();
                else 
                return false;



        }
        if(st.empty())
         return true;
         else
          return false;
    }
}