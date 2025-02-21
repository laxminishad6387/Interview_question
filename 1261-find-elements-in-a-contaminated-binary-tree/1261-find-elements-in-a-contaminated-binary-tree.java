
class FindElements {
private HashSet<Integer> set = new HashSet<>();
    
    public FindElements(TreeNode root) {
       setValue(root,0);
    }
    void setValue(TreeNode root,int data)
    {
       if(root==null)
        return ;
        root.val=data;
        set.add(data);
        setValue(root.left,2*data+1);
        setValue(root.right,2*data+2);
    }

    
    public boolean find(int target) {
        return set.contains(target);
    }
}

