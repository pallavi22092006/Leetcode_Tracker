// Last updated: 8/11/2026, 2:14:30 PM
class Solution {
    public int largestInteger(int n, int s) {
        if(s>9*n)  return -1;
        if(s==0) return 0;
        int result=0;
        for(int i=0;i<n;i++){
            int d=Math.min(9,s);
            result=result*10+d;
            s-=d;
        }
        return result;
    }
}