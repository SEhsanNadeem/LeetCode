class Solution {
    public int firstUniqChar(String s) {
        

        HashMap<Character,Integer> Uch = new HashMap<>(); 

        for(Character ch:s.toCharArray())
        {
            // if(Uch.containsKey(ch))
            // {
                Uch.put(ch,Uch.getOrDefault(ch,0)+1);
            // }
            // else
        }

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);

            if(Uch.get(ch) == 1){
                return i;
            }
        }

        return -1;

    }
}