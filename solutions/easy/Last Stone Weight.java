// Title: Last Stone Weight
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/last-stone-weight/

        for(int nums:stones){
            pq.add(nums);
        }

        while(pq.size()>1){
            int p1=pq.poll();
            int p2=pq.poll();
            pq.add(p1-p2);
        }
        return pq.peek();
    }
}
