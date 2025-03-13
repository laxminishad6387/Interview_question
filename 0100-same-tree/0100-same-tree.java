
class Solution {
    public boolean isSameTree(TreeNode nums1, TreeNode nums2) {
        if(nums1==null && nums2==null) return true;
         else if(nums1!=null && nums2==null) return false;
         else if((nums1==null && nums2!=null)) return false;
         else if(nums1.val!=nums2.val) return false;
         return isSameTree(nums1.left, nums2.left) && isSameTree(nums1.right, nums2.right);
    }
}