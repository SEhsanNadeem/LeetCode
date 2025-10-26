class Solution {
    public int trap(int[] height) {

        int[] sm = new int[height.length];
        int[] pm = new int[height.length];

       int max=0;
       for(int i=0;i<pm.length;i++){
          if(i==0)
          {
            max=height[i];
            pm[i]=height[i];
          }else
          {
            if(max<height[i])
            {
                max=height[i];
                pm[i]=max;
            }else
            {
                pm[i]=max;
            }
          }
     
       }
 
 int max2=0;
        for(int i=sm.length-1;i>=0;i--){
          if(i==sm.length-1)
          {
            max2=height[i];
            sm[i]=height[i];
          }else
          {
            if(max2<height[i])
            {
                max2=height[i];
                sm[i]=max2;
            }else
            {
                sm[i]=max2;
            }
          }
     
       }

int amount=0;
       for(int i=1;i<height.length-1;i++)
       {
           int mins =  Math.min(sm[i],pm[i]);
            if(mins>height[i]){
                
                amount=amount+ (mins-height[i]);
            }


       }


return amount;
    }
}