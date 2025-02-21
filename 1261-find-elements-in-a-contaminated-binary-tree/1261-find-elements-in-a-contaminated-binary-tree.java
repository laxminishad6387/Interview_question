
class FindElements {
private HashSet<Integer> set = new HashSet<>();
    // it is a constructor  of given class
    public FindElements(TreeNode root) {
       setValue(root,0);  // it is given that root always start from root node
    }
    void setValue(TreeNode root,int data)
    {
       if(root==null)   //base condition
        return ;
        root.val=data;
        set.add(data);   //add  each node value  in hashset
        setValue(root.left,2*data+1); 
        setValue(root.right,2*data+2);
    }
   public boolean find(int target) {
        return set.contains(target);
    }
}

