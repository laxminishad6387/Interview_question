// dp problem (top-down approch)
class Solution {
    public int climbStairs(int n) {
        if(n>=0 && n<=3)
        return n;
         int a=2;
         int b=3;
         int c=0;
         for(int i=4; i<=n; i++)
         {
            c=a+b;
            a=b;
            b=c;
         }
         return  c;
    }
}