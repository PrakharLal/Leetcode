// Title: Two Sum
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/two-sum/

        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if(map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            
            map.put(nums[i], i);
        }
        
        return new int[]{-1, -1}; // just in case
    }
}
