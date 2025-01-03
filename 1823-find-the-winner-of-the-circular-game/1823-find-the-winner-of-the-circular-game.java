// ask in microsft company

class Solution {
    public int findTheWinner(int n, int k) {
        // this type of logic is use for circular game related problem solving
     int i=1;
     for(int j=2; j<=n; j++)
     {
        i+=k;
        i=(i-1)%j+1;
     }
     return i;
 }
}