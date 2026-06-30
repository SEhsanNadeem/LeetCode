import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> sett = new HashSet<>();

         int left = 0 ;
         int right = 0 ;
         int maxLength = 0;

while(right<s.length())
{
        while(sett.contains(s.charAt(right)))
        {
            sett.remove(s.charAt(left));
            left++;
        }
        
            sett.add(s.charAt(right));
            maxLength = Math.max(maxLength,right-left +1);
            right++;
        

}

return maxLength;

    }
}