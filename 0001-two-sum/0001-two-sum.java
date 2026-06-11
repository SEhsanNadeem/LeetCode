class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++)
        {
            int current = nums[i];        
            int complement = target - current;
            if(map.containsKey(complement))
            {
                int[] ans = new int[2];
                int first = map.get(complement);
                int second = i;

                ans[0] = first;
                ans[1] = second;
                return ans;
            }else
            {
                map.put(current,i);
            }
        }

return new int[]{};
    }
}