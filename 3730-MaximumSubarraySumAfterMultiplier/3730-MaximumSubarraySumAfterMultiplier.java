// Last updated: 8/11/2026, 2:14:58 PM
class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        return Math.max(solveMultiply(nums,k),solveDivide(nums,k));
    }
    private long solveMultiply(int[] nums,int k){
        long NEG=Long.MIN_VALUE/4;
        long dp0=nums[0];
        long dp1=(long)nums[0]*k;
        long dp2=NEG;

        long ans=Math.max(dp0,dp1);

        for(int i=1;i<nums.length;i++){
            long x=nums[i];
            long y=x*k;

            long ndp0=Math.max(dp0+x,x);
            long ndp1=Math.max(Math.max(dp1+y,dp0+y),y);
            long ndp2=Math.max(Math.max(dp2+x,dp1+x),x);
        
        dp0=ndp0;
        dp1=ndp1;
        dp2=ndp2;

        ans=Math.max(ans,Math.max(dp1,dp2));
    }
    return ans;
}
private long solveDivide(int[] nums,int k){
    long NEG=Long.MIN_VALUE/4;
    long first=divide(nums[0],k);
    long dp0=nums[0];
    long dp1=first;
    long dp2=NEG;

    long ans=Math.max(dp0,dp1);
    for(int i=1;i<nums.length;i++){
        long x=nums[i];
        long y=divide(nums[i],k);
        long ndp0=Math.max(dp0+x,x);
        long ndp1=Math.max(Math.max(dp1+y,dp0+y),y);
        long ndp2=Math.max(Math.max(dp2+x,dp1+x),x);
        dp0=ndp0;
        dp1=ndp1;
        dp2=ndp2;
        ans=Math.max(ans,Math.max(dp1,dp2));
    }
    return ans;
}
    private long divide(int x,int k){
        if(x>=0)
            return x/k;
    return -((-x)/k);
    }
}