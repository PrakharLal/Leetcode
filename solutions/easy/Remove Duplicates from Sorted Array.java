// Title: Remove Duplicates from Sorted Array
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=1;
        int unique=1; //pehla element to unique hi rahega

        while(j<nums.length){
            if(nums[j]==nums[j-1]){
        }
                j++;
            }
                continue;
            else{
                nums[i+1]=nums[j];
            }
    }
                i++;
                j++;
                unique++;
        return unique;
}
