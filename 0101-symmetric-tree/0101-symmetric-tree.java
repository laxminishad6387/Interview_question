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
    boolean isTrue( TreeNode  left , TreeNode right){
        if(left==null && right==null)
        return true;
        else if(left!=null && right==null)
        return false;
        else if(right!=null && left==null)
        return false;
        else if(left.val !=right.val)
        return false;
        return isTrue(left.left, right.right) && isTrue(left.right, right.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
        return true;
       return isTrue(root.left, root.right);
    }
}