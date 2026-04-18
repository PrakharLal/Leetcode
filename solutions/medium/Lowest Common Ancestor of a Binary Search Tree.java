// Title: Lowest Common Ancestor of a Binary Search Tree
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/

    TreeNode ans=null;
    public void lca(TreeNode root, TreeNode p, TreeNode q){
    }

        }
        return ans;
        if(root==null) return;
        if(root==p || root==q){
            ans=root;
            return;
        }
        if(root.val>q.val){
            lca(root.left,p,q);
        }
        else if(root.val<p.val){
            lca(root.right,p,q);
        }
        else{
            ans=root;
            return;
