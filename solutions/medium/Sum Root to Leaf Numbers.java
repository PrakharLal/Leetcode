// Title: Sum Root to Leaf Numbers
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/sum-root-to-leaf-numbers/

 *     }
 * }
 */
class Solution {
    public int sumNumbers(TreeNode root) {
        check(root,sum);
    int res=0;
    int sum=0;
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
