// Last updated: 9/20/2026, 8:21:25 AM
1class Solution {
2    public long countIntersectingIntervals(int[][] intervals) {
3        int n=intervals.length;
4        if(n<2) return 0;
5        int[] starts=new int[n];
6        for(int i=0;i<n;i++){
7            starts[i]=intervals[i][0];
8        }
9        Arrays.sort(starts);
10        long non=0;
11        for(int[] inv:intervals){
12            int end=inv[1];
13            int l=0,h=n;
14            while(l<h){
15                int mid=l+(h-l)/2;
16                if(starts[mid]<=end){
17                    l=mid+1;
18                }
19                else{
20                    h=mid;
21                }
22            }
23            non+=(n-l);
24        }
25        long totalsPairs=((long)n*(n-1))/2;
26        return totalsPairs-non;
27    }
28}