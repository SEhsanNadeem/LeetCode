class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap <Character,Integer> h1=new HashMap<>();

        for(char c1:magazine.toCharArray())
        {
            h1.put(c1,h1.getOrDefault(c1,0)+1);
        }

        for(char c2:ransomNote.toCharArray())
        {
            if(!h1.containsKey(c2) || h1.get(c2)==0)
            {
                return false;
            }
            h1.put(c2,h1.getOrDefault(c2,0)-1);
        }
        return true;
    }
}