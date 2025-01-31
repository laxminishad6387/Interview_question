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
   
  int checkHeight(TreeNode root)
  {
    if(root==null)
     return 0;
     int left=checkHeight(root.left);
     int right=checkHeight(root.right);
     if(left==-1) return -1;  //if left find -1 that tree allready find the unbalalnced subtree
      if(right==-1)return -1;   //if right find -1 that tree allready find the unbalalnced subtree
      if(Math.abs(left-right)>1)
        return -1;
        return 1+Math.max(left,right);

  }
    public boolean isBalanced(TreeNode root) {
        if(root==null)
           return true;
      return  checkHeight(root)!=-1;
    }
}