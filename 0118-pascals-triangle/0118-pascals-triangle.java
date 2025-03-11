class Solution {
    public List<List<Integer>> generate(int row) {
       
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0; i<row; i++)
        {
             List<Integer> temp=new ArrayList<>();
             int k=0;
            for(int j=0; j<=i; j++)
            {
               
                if(j>0 && j<i)
                {
                     
                    int prev=result.get(i-1).get(k);
                    k++;
                    int current=result.get(i-1).get(k);
                    int sum=prev+current;
                    temp.add(sum);
                }
                else
                temp.add(1);
            }
            result.add(temp);
        }
        return result;
    }
}