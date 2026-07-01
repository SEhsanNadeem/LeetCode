class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int sum = 0;
        int left =0;
        int right=0;
        int minLength = Integer.MAX_VALUE;

        while(right<nums.length)
        {

            sum = sum + nums[right];

            while(sum >= target)
            {
                sum = sum - nums[left];
                minLength = Math.min(minLength,right - left +1);
                left++;
            }

            right++;

        }

    return minLength == Integer.MAX_VALUE?0:minLength;
    }
}