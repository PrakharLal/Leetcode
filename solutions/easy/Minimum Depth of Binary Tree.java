// Title: Minimum Depth of Binary Tree
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-depth-of-binary-tree/

        }

        if(root.left==null) {
            return 0;
    public int minDepth(TreeNode root) {
        if(root==null){
            return 1 + minDepth(root.left);
            return 1 + minDepth(root.right);
        }
        if(root.right==null) {
        }

        return 1+Math.min(minDepth(root.right),minDepth(root.left));
    }
