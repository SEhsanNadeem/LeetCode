class Solution {
    public int pivotIndex(int[] nums) {
        
        int[] arr2 = getTotalSum(nums);

         
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
            int leftSum=0;
            int rightSum=arr2[nums.length-1] - arr2[i];
                        if(leftSum == rightSum){
                return i;
            }
            }else
            {
            int leftSum=arr2[i-1];
            int rightSum=arr2[nums.length-1] - arr2[i];
                        if(leftSum == rightSum){
                return i;
            }
            }

        }
return -1;

    }
            public int[] getTotalSum(int[] nums)
        {
        int[] arr2 = new int[nums.length];
            for(int i=0;i<nums.length;i++)
            {
                if(i==0)
                {
                    arr2[i]=nums[i];
                }else
                {
                     arr2[i]=nums[i]+arr2[i-1];
                }
            }
            return arr2;
        }

}