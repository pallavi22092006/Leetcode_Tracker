// Last updated: 8/11/2026, 2:15:12 PM
class Solution {
    public boolean divisorGame(int n) {
        int i,x=0;
        for(i=0;i<n;i++){
        n=n-x;
        if(n%2==0){
        return true;
        }
        else
        return false;
        }
    return false;
    }
}