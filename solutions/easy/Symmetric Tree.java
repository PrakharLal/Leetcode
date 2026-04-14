// Title: Symmetric Tree
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/symmetric-tree/

 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        TreeNode p =root.left;
        TreeNode q=root.right;
 *     TreeNode() {}
 *     TreeNode right;

       return helper(p,q);
    }
    private boolean helper(TreeNode p, TreeNode q){
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;

        boolean r1=helper(p.left, q.right);
        boolean r2=helper(p.right, q.left);
