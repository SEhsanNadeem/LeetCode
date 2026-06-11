class Solution {
    public int firstUniqChar(String s) {
        

        HashMap<Character,Integer> Uch = new HashMap<>(); 

        for(Character ch:s.toCharArray())
        {
                Uch.put(ch,Uch.getOrDefault(ch,0)+1);
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