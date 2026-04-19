// Title: Two Sum IV - Input is a BST
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/two-sum-iv---input-is-a-bst/


        }
            }
                i++;
            else{
            }
                j--;
            else if(list.get(i)+list.get(j)>target){
        return false;
    }
    public void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);

        return;
