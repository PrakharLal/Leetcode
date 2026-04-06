// Title: Reorganize String
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/reorganize-string/

            else{
                if(pq.isEmpty()) return "";

                Pair p2= pq.poll();
                res.append(p2.second);
                seat++;
                p2.first--;
                if(p2.first>0){
                        pq.add(p2);
                } 

            }
        }

    }
            return res.toString();
                        pq.add(p);
}
            }
                }
