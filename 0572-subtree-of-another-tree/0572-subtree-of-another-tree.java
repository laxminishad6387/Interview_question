// apply depth first search

class Solution {
    public boolean check(TreeNode root, TreeNode subroot) {
        Queue<TreeNode> q = new LinkedList<>();
        Queue<TreeNode> p = new LinkedList<>();
        q.add(root);
        p.add(subroot);

        while (!q.isEmpty() && !p.isEmpty()) {
            TreeNode ele1 = q.remove();
            TreeNode ele2 = p.remove();

            if (ele1 == null || ele2 == null || ele1.val != ele2.val) {
                return false;
            }

            if (ele1.left != null || ele2.left != null) {
                if (ele1.left == null || ele2.left == null) return false;
                q.add(ele1.left);
                p.add(ele2.left);
            }

            if (ele1.right != null || ele2.right != null) {
                if (ele1.right == null || ele2.right == null) return false;
                q.add(ele1.right);
                p.add(ele2.right);
            }
        }
        return q.isEmpty() && p.isEmpty();
    }

    public boolean isSubtree(TreeNode root, TreeNode subroot) {
        if (root == null) return false;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode ele = q.remove();

            if (ele.val == subroot.val && check(ele, subroot)) {
                return true;
            }

            if (ele.left != null) q.add(ele.left);
            if (ele.right != null) q.add(ele.right);
        }
        return false;
    }
}
