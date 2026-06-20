class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int m = nums1.length;
        int n = nums2.length;

        int i = 0;
        int j = 0;
        int k = 0;
 

        int[] merged = new int[m+n];

        while(i<m && j<n)
        {

            if(nums1[i] < nums2[j])
            {
                merged[k] = nums1[i];
                i++;
                k++;
            }else
            {
                merged[k] = nums2[j];
                j++;
                k++;
            }

        }

        while(i<m)
        {
            merged[k] = nums1[i];
            i++;
            k++;
        }

        while(j<n)
        {
            merged[k] = nums2[j];
            j++;
            k++;
        }

        int total = merged.length;
        if(total % 2 ==1)
        {
            return merged [total /2];
        }else
        {
            int k1 = merged[total/2 -1];
            int k2= merged[total/2];
            return  (k1+k2)/2.0;
        }

    }
}