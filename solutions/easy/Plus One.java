// Title: Plus One
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/plus-one/

        int n = digits.length;

        for(int i = n - 1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits; // no carry needed
            }
            digits[i] = 0; // carry forward
        }

        // if all digits were 9 → e.g. 999 → 1000
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
    public int[] plusOne(int[] digits) {
class Solution {
