class Solution {
    public int findTheWinner(int n, int k) {
        Deque<Integer> q=new LinkedList<Integer>();
        // push element 1 to n in deque
       int i=1;
        while(i<=n)
        {
            q.addLast(i);
            i++;
        }
        // check deque size is grater than 1 or not
        while(q.size()!=1)
        {
            int j=1;
            while(j<k)
            {
                int temp=q.removeFirst();
                q.addLast(temp);
                j++;
            }
            q.removeFirst();
        }
        return q.removeFirst();

    }
}