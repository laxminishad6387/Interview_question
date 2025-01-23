class Solution {
    public void  backtracking(List<List<Integer>> result, List<Integer>temp, int []arr, int target, int start){
    if(target<0)
      return;
      else if(target==0)
       {
        result.add(new ArrayList<>(temp));
        return;
       }
       for(int i=start; i<arr.length; i++)
       {
        if (i > start && arr[i] == arr[i - 1])
          continue;
         temp.add(arr[i]);
           backtracking(result, temp, arr, target-arr[i], i+1);
           temp.remove(temp.size()-1);
       }
    }
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
       List<List<Integer>> result=new ArrayList<>();
       List<Integer> temp=new ArrayList<>();
       Arrays.sort(arr);
       backtracking(result, temp, arr, target, 0);
       return result; 
    }
}