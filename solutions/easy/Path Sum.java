// Title: Path Sum
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/path-sum/

        sum=sum+root.val;

        if(root.left==null && root.right==null){
            if(sum==targetSum){
                res=true;
            }

        }
        else{
            check(root.left,targetSum,sum);
            check(root.right,targetSum,sum);
        }
    }
        if(root==null) return;
    public void check(TreeNode root, int targetSum, int sum){
    }
        check(root,targetSum,sum);
    public boolean hasPathSum(TreeNode root, int targetSum) {
    boolean res=false;
    int sum=0;
class Solution {
                return;
        return res;
}
