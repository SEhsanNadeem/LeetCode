class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
      int[] freq = new int[26];

      for(char ch : magazine.toCharArray())
      {
        int index = ch - 'a';
        freq[index]++;
      }

        for(char ch:ransomNote.toCharArray())
        {
            freq[ch - 'a']--;


            if(freq[ch - 'a']< 0)
            {
                return false;
            }
        }
        return true ;

    

    }
}