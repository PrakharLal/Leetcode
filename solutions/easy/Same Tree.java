// Title: Same Tree
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/same-tree/

       if(p==null || q==null) return false;
       if(p==null && q==null) return true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
class Solution {
 */
 * }

       if(p.val!=q.val) return false;

       boolean r1= isSameTree(p.left, q.left); 
       boolean r2= isSameTree(p.right,  q.right); 

       if(r1==true && r2==true){
        return true;
       }
       else{
        return false;
       }
    }
