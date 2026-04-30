// Title: Path Sum II
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/path-sum-ii/


        if(root==null) return;
    public void check(TreeNode root, int targetSum,int sum){
    }
        sum+=root.val;
        diary.add(root.val);
        if(root.right==null && root.left==null){
            if(sum==targetSum){
                res.add(new ArrayList<>(diary));
                
            }
        }
        else{
            check(root.left,targetSum,sum);
            check(root.right,targetSum,sum);
        }
        diary.remove(diary.size()-1);
    }
}
        return res;
