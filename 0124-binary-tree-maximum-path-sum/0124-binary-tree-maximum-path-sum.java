/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max=Integer.MIN_VALUE;;
    public int check(TreeNode  root)
    {
         if(root==null)
         return 0;
         int left=Math.max(0,check(root.left));
         int right=Math.max(0,check(root.right));
         if(left==0 && right==0 && max<root.val)
            max=root.val;
         
           else if(left>=0 && right>=0 && max<(left+right+root.val))
                max=left+right+root.val;
           else if(left<0 && right>0 && max<root.val+right)
             max=right+root.val;
             else if(left>=0 && right<0 && max<root.val+left)
             max=root.val+left;
            
            if(left<0 && right<0)
              return root.val;
              else
               return root.val+Math.max(left,right);

    }
    public int maxPathSum(TreeNode root) {
       check(root);
       return max;

    }
}