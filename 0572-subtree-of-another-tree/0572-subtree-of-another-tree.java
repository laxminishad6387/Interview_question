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
    boolean isInside(TreeNode root,TreeNode subroot)
    {
        if(root==null && subroot==null)
          return true;
          else if(root==null || subroot==null)
           return false;
           else if(root.val!=subroot.val)
           return false;
           return isInside(root.left,subroot.left) && isInside(root.right,subroot.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subroot) {
        if(root==null)
        return false;
        if(isInside(root,subroot))
        return true;
        return isSubtree(root.left,subroot)||isSubtree(root.right,subroot);

    }
}