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
     List<List<Integer>> result=new ArrayList<>();
        if(root==null)
        return new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            List<Integer> ans=new ArrayList<>();
            int n=q.size();
            for(int i=1; i<=n; i++)
            {
                TreeNode ele=q.remove();
                ans.add(ele.val);
                if(ele.left!=null)
                q.add(ele.left);
                if(ele.right!=null)
                q.add(ele.right);
            }
            result.add(ans);
        }
        return result;
        
    }
}