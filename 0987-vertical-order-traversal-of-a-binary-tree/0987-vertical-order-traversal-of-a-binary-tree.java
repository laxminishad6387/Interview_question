/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    class Pair{
        int row; 
        int col; 
        TreeNode root;
        Pair(int row, int col, TreeNode root){
            this.row=row;
            this.col=col; 
            this.root=root;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        TreeMap<Integer, List<int[]>> map = new TreeMap<>();
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(0,0,root));
        while(!q.isEmpty())
        {
            Pair currNode=q.remove();
             // Use computeIfAbsent to simplify map handling
            map.computeIfAbsent(currNode.col, k -> new ArrayList<>())
                .add(new int[]{currNode.row, currNode.root.val});
             if(currNode.root.left!=null)
             q.add(new Pair(currNode.row + 1, currNode.col -1, currNode.root.left));
               if(currNode.root.right!=null)
             q.add(new Pair(currNode.row + 1, currNode.col +1, currNode.root.right));
        }
        for (int col : map.keySet()) {
            List<int[]> nodes = map.get(col);
            // Sort by row first, then by value if row is same
            Collections.sort(nodes, (a, b) -> {
                if (a[0] == b[0]) {
                    return a[1] - b[1];
                }
                return a[0] - b[0];
            });
            
            List<Integer> colNodes = new ArrayList<>();
            for (int[] node : nodes) {
                colNodes.add(node[1]);
            }
            result.add(colNodes);
        }
        return result;
    }
}