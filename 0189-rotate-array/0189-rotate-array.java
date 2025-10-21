class Solution {
    public void rotate(int[] nums, int k) {


        k=k%nums.length;

        ArrayUtils.reverse(nums,0,nums.length-1);

        ArrayUtils.reverse(nums,0,k-1);

        ArrayUtils.reverse(nums,k,nums.length-1);

    }
}

class ArrayUtils
{
    public static void reverse(int[] arr,int start,int end)
    {

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }

    }
}