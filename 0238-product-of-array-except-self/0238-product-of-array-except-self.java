class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr2 = totalProduct(nums);

        int suffix=1;
        for(int i=nums.length-1;i>0;i--)
        {
            arr2[i] = arr2[i-1]*suffix;
            suffix = suffix * nums[i];
        }
        arr2[0] = suffix;
return arr2;


    }

    public int[] totalProduct(int[] nums){
        int n=nums.length;
        int[] arr2 = new int[n] ;

         arr2[0] = nums[0];
        for(int i=1;i<n-1;i++){

            arr2[i]=nums[i] * arr2[i-1];
        }
  return arr2;
    }


}