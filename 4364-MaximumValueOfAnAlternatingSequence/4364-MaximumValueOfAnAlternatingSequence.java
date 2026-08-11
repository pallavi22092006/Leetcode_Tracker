// Last updated: 8/11/2026, 2:13:38 PM
class Solution {
    public long maximumValue(int n, int s, int m) {
        if(n==1){
            return s;
        }
        long upsteps=n/2;
        return (long)s+upsteps*(m-1)+1;
    }
}