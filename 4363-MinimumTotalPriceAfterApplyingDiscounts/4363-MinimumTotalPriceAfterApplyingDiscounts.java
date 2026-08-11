// Last updated: 8/11/2026, 2:13:49 PM
import java.util.*;

class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);

        double totalSum=0.0;
        int pi=prices.length-1;
        int di=discounts.length-1;

        while(pi>=0){
            if(di>=0){
                totalSum+=prices[pi]*(100.0 - discounts[di])/100.0;
                di--;
            }
            else{
                totalSum+=prices[pi];
            }
            pi--;
        }
        return totalSum;
    }
}