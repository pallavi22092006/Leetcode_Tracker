// Last updated: 8/11/2026, 2:15:20 PM
class Solution {
    public int missingNumber(int[] nums) {
      int sum=0,ans=0;
      int n=nums.length;
       for(int i=0;i<n;i++){
        sum +=nums[i];
       }
        ans=n*(n+1)/2;
        ans =ans-sum;
        return ans;
    }
}