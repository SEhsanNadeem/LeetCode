class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr2 = totalProduct(nums);

        int suffix=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            if(i==0){
            arr2[i] = suffix;
            // suffix = suffix * nums[i];
            }else{
            arr2[i] = arr2[i-1]*suffix;
            suffix = suffix * nums[i];
            }

        }
return arr2;


    }

    public int[] totalProduct(int[] nums){
        int n=nums.length;
        int[] arr2 = new int[n] ;

         arr2[0] = nums[0];
        for(int i=1;i<n-1;i++){
            // if(i==0){
            //   arr2[i]=nums[i];  
            // }else
            // {

            arr2[i]=nums[i] * arr2[i-1];
            // }
        }
  return arr2;
    }


}