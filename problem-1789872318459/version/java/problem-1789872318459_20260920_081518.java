// Last updated: 9/20/2026, 8:15:18 AM
1class Solution {
2    public int countIntersectingIntervals(int[][] intervals) {
3        int n=intervals.length;
4        int[] starts=new int[n];
5        for(int i=0;i<n;i++){
6            starts[i]=intervals[i][0];
7        }
8        Arrays.sort(starts);
9        long non=0;
10        for(int[] inv:intervals){
11            int end=inv[1];
12            int l=0,h=n;
13            while(l<h){
14                int mid=l+(h-l)/2;
15                if(starts[mid]<=end){
16                l=mid+1;
17                }
18                else{
19                h=mid;
20                }
21            }
22            non+=(n-l);
23        }
24        long totalsPairs=((long)n*(n-1))/2;
25        return (int)(totalsPairs-non);
26    }
27}