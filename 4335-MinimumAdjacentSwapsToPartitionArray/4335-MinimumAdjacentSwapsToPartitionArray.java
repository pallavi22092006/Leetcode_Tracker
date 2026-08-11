// Last updated: 8/11/2026, 2:14:47 PM
class Solution {
    public int minAdjacentSwaps(int[] nums, int a, int b) {
        long MOD =1_000_000_007L;
        long count1=0;
        long count2=0;
        long totalSwaps=0;
        for(int num:nums){
            if(num<a){
                totalSwaps+=(count1+count2);
            }
            else if(num<=b){
                count1++;
                totalSwaps+=count2;
            }
            else{
                count2++;
            }
        }
        return (int )(totalSwaps%MOD);
    }
}