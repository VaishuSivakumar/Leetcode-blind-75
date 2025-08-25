public class best_time_to_buy_and_sell_stocks {
    //This is brute force approach
    //note: when test case is {2,4,1} o/p to be 2. The below approach failscd "C:\Users\vaishnacd "C:\Users\vaishna
    public static void main(String[] args) {
      int[] prices= {10,8,7,5,2};
      int min_index=-1;
        int min = Integer.MAX_VALUE; // Initialize with the maximum possible integer value
        for (int i=0; i < prices.length; i++) {
            if (prices[i]< min) {
                min = prices[i]; // Update min if a smaller value is found
                min_index=i;

            }}
            int temp=0;
            for(int j=min_index+1; j < prices.length; j++) {
                int diff= prices[j] - min;
                if(diff > temp) {
                    temp = diff; // Update temp if a larger difference is found
                }
            }
            System.out.println("Maximum profit is: " + temp);

        }


    }

