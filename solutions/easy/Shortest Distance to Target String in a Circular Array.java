// Title: Shortest Distance to Target String in a Circular Array
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/shortest-distance-to-target-string-in-a-circular-array/

class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;

        for (int i = 0; i < n; i++) {
            // check right direction
            int right = (startIndex + i) % n;
            
            // check left direction
            int left = (startIndex - i + n) % n;

            if (words[right].equals(target) || words[left].equals(target)) {
                return i;
