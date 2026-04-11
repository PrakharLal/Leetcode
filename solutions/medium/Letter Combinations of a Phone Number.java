// Title: Letter Combinations of a Phone Number
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/letter-combinations-of-a-phone-number/

        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        StringBuilder temp=new StringBuilder();
        List<String> res= new ArrayList<>();
        int idx=0;
        int n= digits.length();

        helper(temp,res,digits,idx,n,map);
        return res;

    }

public void helper(StringBuilder temp, List<String> res, String digits, int idx,
int n,HashMap<Character,String> map)  
    {
        if(idx==n){
            res.add(temp.toString());
            return;
        }    

        String choice=map.get(digits.charAt(idx));
        for(int j=0;j<choice.length();j++){
            temp.append(choice.charAt(j));
            helper(temp,res,digits,idx+1,n,map);
            temp.deleteCharAt(temp.length()-1);
        }
        return;
    }
}
