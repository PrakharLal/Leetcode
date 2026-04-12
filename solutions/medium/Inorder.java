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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inTrav(root,res);
        return res;
    }

    public void inTrav(TreeNode node,List<Integer> res){
        if(node==null) return;

        inTrav(node.left,res);
        res.add(node.val);
        inTrav(node.right,res);

        return;
    }
}
