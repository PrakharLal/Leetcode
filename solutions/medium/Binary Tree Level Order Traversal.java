// Title: Binary Tree Level Order Traversal
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/binary-tree-level-order-traversal/

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> wrapList = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return wrapList;
        q.add(root);
        while(!q.isEmpty()){
            
            if(curr.left!=null) q.add(curr.left);
            int levelSize=q.size();
            for(int i=0;i<levelSize;i++){
            if(curr.right!=null) q.add(curr.right);
            }
            subList.add(curr.val);
            List<Integer> subList=new ArrayList<>();
            TreeNode curr=q.poll();
            wrapList.add(subList);
        }
        return wrapList;
