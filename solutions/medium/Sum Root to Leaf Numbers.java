// Title: Sum Root to Leaf Numbers
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/sum-root-to-leaf-numbers/

        check(root,sum);
        return res;
    }
    public void check(TreeNode root,int sum){
        if(root==null) return;
        sum=sum*10+root.val;

        if(root.left==null && root.right==null){
            res+=sum;
            return;
        }

        check(root.left,sum);
        check(root.right,sum);
    }
}
