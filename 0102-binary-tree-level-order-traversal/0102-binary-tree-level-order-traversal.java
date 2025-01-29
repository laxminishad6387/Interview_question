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
         List<List<Integer>>  ans=new ArrayList<>();
         Queue<TreeNode> q=new LinkedList<>();
         q.add(root);
         while(!q.isEmpty())
         {
            List<Integer> temp=new ArrayList<>();
            int n=q.size();
            for(int i=0; i<n; i++)
            {
                TreeNode ele=q.remove();
                temp.add(ele.val);
                if(ele.left!=null)
                 q.add(ele.left);
                 if(ele.right!=null)
                 q.add(ele.right);
            }
            ans.add(temp);
         }
         return ans;
    }
}