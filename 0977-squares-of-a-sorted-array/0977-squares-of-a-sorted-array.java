class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] ns = new int[n];

         int left = 0;
         int right = n-1;
         int pos = n-1;   

         while(left<=right)
         {
            
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if(leftSquare > rightSquare)
            {

                ns[pos] = leftSquare;
                left++;

            }else
            {

                ns[pos] = rightSquare;
                right--;
            }

            pos--;
         }
        return ns;
}

}