class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> me = new HashMap<>();

        for(int num:nums){
            me.put(num,me.getOrDefault(num,0)+1);
        }

        int nn = nums.length/2;
        for(Map.Entry<Integer,Integer> entry : me.entrySet()){
            if (entry.getValue() > nn)
            {
                return entry.getKey();
            }
        }
        

return -1;
    }
}