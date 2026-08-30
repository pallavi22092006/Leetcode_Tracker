// Last updated: 8/30/2026, 8:35:53 AM
1class Solution {
2    public int sumDecoded(long[] nums) {
3        long MOD=1000000007L;
4        long ans=0;
5        long[] v=nums;
6        for(long num:v){
7            int w=(int)(num%10);
8            long d=num/10;
9            long p=1;
10            long temp=d;
11            for(int i=0;i<w;i++)
12                temp/=10;
13            while(temp>0){
14                p*=10;
15                temp/=10;
16            }
17            
18            long x=d/p;
19            long y=d%p;
20            long r=1;
21            
22            while(y>0){
23                if(y%2==1)
24                    r=r*x%MOD;
25                x=x*x%MOD;
26                y/=2;
27            }
28            ans=(ans+r)%MOD;
29        }
30        return (int)ans;
31    }
32}