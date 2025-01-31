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
    int maxSum=Integer.MIN_VALUE;
    public int check(TreeNode root)
    {
        if(root==null)
         return 0;
         int left=Math.max(0,check(root.left));
         int right=Math.max(0,check(root.right));
         int currentSum=root.val+left+right;
         maxSum=Math.max(currentSum,maxSum);
         return root.val+Math.max(left,right);
    }
    public int maxPathSum(TreeNode root) {
      check(root);
      return maxSum;

    }
}