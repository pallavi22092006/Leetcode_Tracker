// Last updated: 8/11/2026, 2:15:30 PM
class Solution {
    public int maxProfit(int[] prices) {
        int mp= Integer.MAX_VALUE;
        int MP= 0;

        for (int price : prices) {
            if (price < mp) {
                mp = price;
            } else {
                MP= Math.max(MP, price - mp);
            }
        }

        return MP;
    }
}