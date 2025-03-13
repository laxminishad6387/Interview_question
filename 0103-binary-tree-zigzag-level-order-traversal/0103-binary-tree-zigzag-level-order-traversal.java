
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null)
        return new ArrayList<>();
        List<List<Integer>>result=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        int  count=-1;
        while(!q.isEmpty())
        {
            List<Integer>temp=new ArrayList<>();
            count++;
            int n=q.size();
            for(int i=1; i<=n; i++)
            {
                TreeNode curr=q.remove();
                temp.add(curr.val);
                if(curr.left!=null)
                q.add(curr.left);
                if(curr.right!=null)
                q.add(curr.right);
            }
            if(count%2!=0)
            Collections.reverse(temp);
            result.add(temp);
        }
        return result;
    }
}