
class Solution {
    boolean check(TreeNode root, TreeNode subRoot)
    {
        if(root==null && subRoot==null)
        return true;
        else if(root==null ||subRoot==null)
          return false;
          else if(root.val!=subRoot.val)
          return false;
          return check(root.left,subRoot.left) && check(root.right,subRoot.right);
    }
    boolean findRoot(TreeNode root, TreeNode subRoot)
    {
        if(root==null)
          return false;
          if(check(root,subRoot))
           return true;
          return findRoot(root.left,subRoot)|| findRoot(root.right,subRoot);
          
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
     return  findRoot(root,subRoot);
    }
}