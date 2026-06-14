class Solution {
    public int maxProfit(int[] prices) {
        

        int minPrice = prices[0];
        int maxPf = 0 ;

        for(int price : prices)
        {

            if(minPrice > price)
            {
                minPrice = price;
            }
            
            int currentProf = price - minPrice ;
            if(maxPf < currentProf)
            {
                maxPf = currentProf;
            }

        }
        return maxPf;

        // int minimum = prices[0];
        // int max = prices[1];
        // int profit=;;

        // for(int  i = 0; i < prices.length ; i++)
        // {

        //     if(prices[minimum] > prices[i])
        //     {
        //         prices[minimum] =  prices[i];
        //         continue;
        //     }
        //     if(prices[max] > prices[minimum])
        //     {

        //     }


        // }


        // for(int  i = 0; i < prices.length ; i++)
        // {
        //     for(int j = 1; j< prices.length ; j++)
        //     {
        //         if(prices[minimum] < prices[j])
        //         {
        //             minimum = prices[i]
                
        //         }else
        //         {
        //             minimum = prices[j]
        //             continue;
        //         }
        //     }
        // }

    }
}