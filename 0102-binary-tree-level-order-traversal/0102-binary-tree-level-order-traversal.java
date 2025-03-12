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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null)
        return new ArrayList<>();
        List<List<Integer>>result=new ArrayList<>();
        Queue<TreeNode> q=new  LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            List<Integer>ans=new ArrayList<>();
            int n=q.size();
            for(int i=0; i<n; i++)
            {
                TreeNode curr=q.remove();
                ans.add(curr.val);
                if(curr.left!=null)
                q.add(curr.left);
                if(curr.right!=null)
                q.add(curr.right);
            }
            result.add(ans);
        }
        return result;
    }
}