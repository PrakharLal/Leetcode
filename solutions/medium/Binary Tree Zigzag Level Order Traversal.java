// Title: Binary Tree Zigzag Level Order Traversal
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/

    while(!queue.isEmpty()){
        int levelsize=queue.size();
        List<Integer> sublist= new ArrayList<>();
        if(curr.left!=null) queue.add(curr.left);
        TreeNode curr = queue.poll();
        if(curr.right!=null) queue.add(curr.right);

        if(leftToRight) sublist.add(curr.val);
        for(int i=0;i<levelsize;i++){
       
        queue.add(root);

        if(root==null) return wraplist;
        if(!leftToRight) sublist.add(0, curr.val);
}
    }
wraplist.add(sublist);
        leftToRight=!leftToRight;
    return wraplist;
