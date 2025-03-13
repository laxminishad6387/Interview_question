
class Solution {
    int maxDiameter=0;
    int isTrue(TreeNode root)
    {
        if(root==null)
        return 0;
        int left=isTrue(root.left);
        int right=isTrue(root.right);
        int diameter=left+right;
        maxDiameter=Math.max(maxDiameter,diameter);
        return Math.max(left,right)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        isTrue(root);
        return  maxDiameter;
    }
}