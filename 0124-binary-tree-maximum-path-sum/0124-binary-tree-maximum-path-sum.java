
class Solution {
   int maxPath=Integer.MIN_VALUE;
   int isTrue(TreeNode root){
        if(root==null)
         return 0;
        
       int left = Math.max(0, isTrue(root.left));
        int right = Math.max(0, isTrue(root.right));
        
         maxPath=Math.max(maxPath,root.val+right+left);
         return root.val+Math.max(left, right);
    }
    public int maxPathSum(TreeNode root) {
       int ans=isTrue(root);
       if(ans>maxPath)
       return ans;
       else return maxPath;
    }
}