// Title: Invert Binary Tree
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/invert-binary-tree/

 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
 *         this.val = val;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;

        swapChildren(root);
    public void swapChildren(TreeNode root) {

        invertTree(root.left);
        invertTree(root.right);

        return root;

    
    }
}
