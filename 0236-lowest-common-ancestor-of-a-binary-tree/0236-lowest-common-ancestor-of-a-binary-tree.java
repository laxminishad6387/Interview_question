/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // base condition
        if(root==null)  //pointer point null position
         return null;
         else if(root==p || root==q)  
          return root;
          TreeNode left=lowestCommonAncestor(root.left, p,  q);
           TreeNode right=lowestCommonAncestor(root.right, p,  q);
           if(left!=null && right!=null)  //meet first ancestor
             return root;
             else if(left!=null)
              return left;
              else if(right!=null)
                return right;
                else
               return null;
    }
}