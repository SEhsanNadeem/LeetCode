class Solution {
    public void moveZeroes(int[] nums) {
        

     int insertPos=0;
    //  int e=nums.length-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0){
            int temp=nums[i];    
            nums[i]=nums[insertPos];
            nums[insertPos]=temp;

            insertPos++;
            }
        }

    }
}