// Last updated: 8/11/2026, 2:14:36 PM
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long ans=0;
        int n=nums.length;
        for(int i=0;i<k;i++){
            int val=nums[n-1-i];
            int currentMul=mul-i;
            if(currentMul>1){
                ans+=(long)val*currentMul;
            }
            else{
                ans+=val;
            }
        }
        return ans;
    }
}