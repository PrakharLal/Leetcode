// Title: Binary Tree Preorder Traversal
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/binary-tree-preorder-traversal/

 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result= new ArrayList<>();
    }
        preTrav(root,result);
        return result;

    public void preTrav(TreeNode node,List<Integer> result){
        if(node==null) return;
        result.add(node.val);
        preTrav(node.left,result);
        preTrav(node.right,result);

        return;
    }
}
