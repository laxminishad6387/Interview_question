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
    int max=0;  //it conatain the max diameter of the tree
    public int diameter(TreeNode root)
    {
        // base condition
        if(root==null)
         return 0;
        int left=diameter(root.left);  //get  the left side height of it's parent
        int right=diameter(root.right);  //get  the right side height of it's parent
        int diameter=left+right;
        max=Math.max(diameter,max);
        return 1+Math.max(left,right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
       diameter( root);
       return max;
    }
}