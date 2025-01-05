// solve using stack 
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack1=new Stack<>();
          char arr1[]=s.toCharArray();
         for(char n: arr1)
         {
            if(n=='{' || n=='[' || n=='(')
            {
                stack1.push(n);
                continue;
            
            }
            else {
                  if(stack1.empty() && n=='}' || stack1.empty() && n==']'||stack1.empty() && n==')' )
                   return false;
                
               char top=stack1.peek();
             if(n=='}' && top=='{')
                stack1.pop();
            
             else if(n==')' && top=='(')
               stack1.pop();
        
             else if(n==']' && top=='[')
               stack1.pop();

             else return false;
            }
         }

         if(stack1.empty())
          return true;
         else
          return false;
    }
}