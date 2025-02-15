
class Solution {
    boolean isInside(TreeNode root,TreeNode subroot)
    {
        
        if(root==null && subroot==null)  //base condition
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