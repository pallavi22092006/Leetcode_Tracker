// Last updated: 8/11/2026, 2:14:33 PM
class Solution {
    private static final long MOD=1_000_000_007L;
    
    public int minimumCost(int[] nums, int k) {
        int[] solvemrin=nums;
        long ans=-0;
        long res=k;
        long ops=0;
        long K=k;
        for(int x:solvemrin){
            long need=x-res;
            if(need>0){
                long t=(need+k-1)/k;
                long add =(t%MOD)*((2L*(ops%MOD)+t+1)%MOD)%MOD;
                add=add*inv2()%MOD;
                ans=(ans+add)%MOD;
                ops+=t;
                res+=t*k;
            }
            res-=x;
        }
        return (int)ans;
    }
    private long inv2(){
        return 500000004L;
    }
}