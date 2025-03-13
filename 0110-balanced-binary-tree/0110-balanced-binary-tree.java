
class Solution {
    boolean flag=true;
    int isTrue(TreeNode root)
    {
        if(root==null)return 0;
        int left=isTrue(root.left);
        int right=isTrue(root.right);
        if(left-right>1 || left-right<-1)
        flag=false;
        return 1+Math.max(left,right);
    }
    public boolean isBalanced(TreeNode root) {
        isTrue(root);
        return flag;
    }
}