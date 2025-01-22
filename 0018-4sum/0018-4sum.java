class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        // store all ppsible result
        List<List<Integer>> result=new ArrayList<>();
        // sort the original array
          Arrays.sort(arr);
        // 4 sum problem 
        for(int i=0; i<arr.length-3; i++)
        {
            if(i>0 && arr[i]==arr[i-1])
            continue;
            // 4 sum problem convert in 3 sum problem
            // it is a 3 sum problem
            for(int j=i+1; j<arr.length-2; j++)
            {
                if(j>i+1 && arr[j]==arr[j-1])
                  continue;
                  int left=j+1;
                  int right=arr.length-1;
                  while(left<right)
                  {
                    long sum=(long)arr[i]+arr[j]+arr[left]+arr[right];
                    // case 1 sum==target
                    if(sum==target)
                    {
                        result.add(Arrays.asList(arr[i], arr[j],arr[left],arr[right]));
                        while(left<right && arr[left]==arr[left+1]) //remove duplicate entry from the result
                        left++;
                        while(left<right && arr[right]==arr[right-1])  //remove duplicate entry from the result
                         right--;
                         left++;   //apply each iteration
                         right--;  // apply in each iteration
                    }
                    // case 2 sum is less than target
                    else  if(sum<target)
                      left++;
                      else
                       right--;

                  }
            }
        }
        return result;

    }
}