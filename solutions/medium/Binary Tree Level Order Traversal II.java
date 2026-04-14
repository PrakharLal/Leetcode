// Title: Binary Tree Level Order Traversal II
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/binary-tree-level-order-traversal-ii/


        queue.add(root);

        while(!queue.isEmpty()){
            int levelSize=queue.size();
            for(int i=0;i<levelSize;i++){
                if(curr.left!=null) queue.add(curr.left);
                TreeNode curr = queue.poll();
            List<Integer> sublist = new ArrayList<>();
        if(root==null) return wrapList;

                if(curr.right!=null) queue.add(curr.right);
        List<List<Integer>> wrapList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
class Solution {
 */
 * }
 *     }

                sublist.add(curr.val);
            }
            int j=0;
            wrapList.add(j++, sublist);
        }
        return wrapList;
