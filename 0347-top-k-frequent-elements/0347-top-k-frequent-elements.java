class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> KFrequent = new PriorityQueue<>((a,b)->map.get(a)-map.get(b));

        for(int num:map.keySet())
        {
            KFrequent.offer(num);

            if(KFrequent.size()>k)
            {
                KFrequent.poll();
            }

        }




            int[] result = new int[k];

            for(int i = 0; i<k;i++)
            {

                result[i] = KFrequent.poll();

            }


            return result;

    }
}