class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        // int[] arr = new int[nums.length];
    int left=0 ;
    int right=nums.length-1;
    
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]%2==0){
        //         count++;
        //         arr[i]=
        //         }
        // }

        while(left<right)
        {
                if(nums[left] %2 > nums[right]%2)
                {
                    int temp=nums[right];
                    nums[right]=nums[left];
                    nums[left]=temp;
                }

            if (nums[left]%2==0){left++;}
            if (nums[right]%2==1){right--;}
        }
        return nums;
    }
}