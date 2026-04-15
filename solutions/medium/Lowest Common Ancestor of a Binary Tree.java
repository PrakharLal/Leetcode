// Title: Lowest Common Ancestor of a Binary Tree
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/

        if (root == p || root == q) {
            self = 1;
        }

        int total = left + right + self;
        int self = 0;

        int left = dfs(root.left, p, q);
        int right = dfs(root.right, p, q);


        if (total == 2 && ans == null) {
            ans = root;
        }

        return total;
    }
}
