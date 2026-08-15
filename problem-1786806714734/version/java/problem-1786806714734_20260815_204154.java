// Last updated: 8/15/2026, 8:41:54 PM
1class Solution {
2    public int minOperations(String s) {
3        int n=s.length();
4        int m=Integer.MAX_VALUE;
5        for(int k=0;k<n;k++){
6            int c=k;
7            for(int i=0;i<n/2;i++){
8               char c1=s.charAt((i+k)%n);
9                char c2=s.charAt((n-1-i+k)%n);
10                int d1=(c2-c1+26)%26;
11                int d2=(c1-c2+26)%26;
12                c+=Math.min(d1,d2);
13                
14            }
15            m=Math.min(m,c);
16        }
17        return m;
18    }
19}