// Last updated: 10/4/2026, 8:17:50 AM
1class Solution {
2    public int minRotations(int n, String s) {
3        int tn=getDist(0,s.charAt(0)-'0');
4        for(int i=0;i<n-1;i++)
5         tn+=getDist(s.charAt(i)-'0',s.charAt(i+1)-'0');
6        int min=tn;
7        int ck=tn-getDist(0,s.charAt(0)-'0')+getDist(0,s.charAt(n-1)-'0');
8        min=Math.min(min,ck);
9        for(int k=1;k<n;k++){
10            int o=getDist(s.charAt(k-1)-'0',s.charAt(k)-'0');
11            int nt=getDist(s.charAt(k-1)-'0',s.charAt(n-1)-'0');
12
13            int cc=tn-o+nt;
14            min=Math.min(min,cc);
15        }
16        return min;
17    }
18    private int getDist(int a,int b){
19        int d=Math.abs(a-b);
20        return Math.min(d,10-d);
21    }
22}