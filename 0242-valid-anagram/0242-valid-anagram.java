class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character,Integer> h = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }

        for(char c1:s.toCharArray())
        {
            h.put(c1,h.getOrDefault(c1,0)+1);
        }

        for (char c2: t.toCharArray())
        {
            if(!h.containsKey(c2) || h.get(c2)==0)
            {
                return false;
            }
            h.put(c2,h.getOrDefault(c2,0)-1);
        }
        return true;

    }
}