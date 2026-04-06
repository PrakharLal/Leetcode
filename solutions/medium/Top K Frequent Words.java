// Title: Top K Frequent Words
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/top-k-frequent-words/

    int frequency = entry.getValue();

    Pair curr= new Pair(frequency,word);

    if(pq.size()>k){
    pq.add(curr); 
    
        pq.poll();
        
    }
    
    }
    ArrayList<String> ans=new ArrayList<>();
    while(!pq.isEmpty()){
        ans.add(pq.poll().second);
    }
    Collections.reverse(ans);
    return ans;
    }
}
