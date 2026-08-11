// Last updated: 8/11/2026, 2:15:02 PM
class Solution {
    public int numberOfCuts(int n) {
        if(n==1)
        return 0;
         else if(n==2 )
        return 1;
        else if(n%2==0)
        return n/2;
        else 
        return n;
        
     }
}