class Solution {
    public int findKthLargest(int[] nums, int k) {


        PriorityQueue<Integer> Klargest = new PriorityQueue<>();

        for(int num:nums)
        {
            Klargest.offer(num);

        if(Klargest.size()>k)
        {
            Klargest.poll();
        }

        }
        
        return Klargest.peek();

    }

}