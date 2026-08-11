// Last updated: 8/11/2026, 2:15:07 PM
class Solution {
    public int[] runningSum(int[] nums) {
        int n= nums.length;
        int i,sum=0;
        // int r[]=new int[n];
        // for(i=0;i<n;i++){
        //     sum+=nums[i];
        //     r[i]=sum;
        // }
        // return r;
        for(i=1;i<n;i++)
        nums[i]+= nums[i-1];
        return nums;
    }
}