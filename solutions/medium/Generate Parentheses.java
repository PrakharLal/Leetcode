// Title: Generate Parentheses
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/generate-parentheses/

class Solution {
    public List<String> generateParenthesis(int n) {
        int open=0;
        int close=0;
        StringBuilder temp=new StringBuilder();
        List<String> res= new ArrayList<>();
        helper(open, close, n, temp, res);
        return res;
    }
    private void helper(int open, int close, int n, StringBuilder temp, List<String> res){

        if(open==n && close==n){
            res.add(temp.toString());
            return;
        }

        //open bracket
        if(open<n){
            temp.append("(");
