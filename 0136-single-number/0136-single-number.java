class Solution {
    public int singleNumber(int[] nums) {
        
        int ans=0;
        for(int i=0; i<nums.length;i++)
        {
          ans=ans^nums[i];
        }
        // for(int num:nums) 
        // {
        //  ans=ans^num;
        // }
        return ans;
    }
}