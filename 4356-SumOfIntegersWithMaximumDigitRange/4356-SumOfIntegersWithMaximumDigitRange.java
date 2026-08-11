// Last updated: 8/11/2026, 2:14:15 PM
class Solution {
    public int maxDigitRange(int[] nums) {
        int maxRange=-1;
        for(int num: nums){
            int temp=num;
            int max=0,min=9;

            if(temp==0){
                max=min=0;
            }
            while(temp>0){
                int digit=temp%10;
                max=Math.max(max,digit);
                min=Math.min(min,digit);
                temp/=10;
            }
            maxRange=Math.max(maxRange,max - min);
        
        }
        int sum=0;
        for(int num:nums){
        int temp=num;
        int max=0,min=9;
        if(temp==0){
            max=min=0;
        }
        while(temp>0){
            int digit=temp%10;
            max=Math.max(max,digit);
            min=Math.min(min,digit);
            temp/=10;
        }
        if(max-min==maxRange){
            sum+=num;
        }
    }
    return sum;
    }
}