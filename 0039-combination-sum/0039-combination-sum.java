class Solution {
    public void  backtracking(List<List<Integer>> result,ArrayList<Integer> temp,int []candidates,int target,int start){
     if(target<0)
       return;
       else if(target==0)
       {
        result.add(new ArrayList<>(temp));
        return;
       }
       for(int i=start; i<candidates.length; i++)
       {
          temp.add(candidates[i]);
           backtracking(result,temp,candidates,target-candidates[i],i);
           temp.remove(temp.size()-1);
       }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> result=new ArrayList<>();
    backtracking(result,new ArrayList<Integer>(),candidates,target,0);
    return result;
    }
}