class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;
        int sum =0;
        // double ans = 0;

        for(int i = 0; i<k ; i++)
        {
            sum = nums[i] + sum;
        }
        
        int ans = sum;

        int s = 1;
        int e= k; 


        while(e<n)
        {
            sum = sum + nums[e] - nums[s-1];
            ans = Math.max(sum,ans);
            s++;
            e++;
        }

        double maxAvg = (double)ans/k ;
        return maxAvg;

    }
}