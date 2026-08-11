// Last updated: 8/11/2026, 2:14:39 PM
class Solution {
    private static final int MOD=1_000_000_007;
    public int countValidSequences(int n, int k) {
        if(n<k) return 0;
        long total=nCr(n-1,k-1);
        long invalid=((n-k)%2==0)?nCr((n-k)/2+k-1,k-1):0;
        return (int) ((total-invalid+MOD)%MOD);
    }
    private long nCr(int N , int K ){
        if(K<0 ||K>N) return 0;
        long num=1;long den=1;
        K=Math.min(K,N-K);
        for(int i=1;i<=K;i++){
            num=(num*(N-i+1))%MOD;
            den=(den*i)% MOD;
        }
        return (num*java.math.BigInteger.valueOf(den).modInverse(java.math.BigInteger.valueOf(MOD)).longValue())%MOD;
    }
}