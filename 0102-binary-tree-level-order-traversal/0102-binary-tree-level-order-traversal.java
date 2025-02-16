// BINARY SEARCH
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null)
        return new ArrayList<>();
        List<List<Integer>>result=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int n=q.size();
            List<Integer>ans=new ArrayList<>();
            for(int i=0; i<n; i++)
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