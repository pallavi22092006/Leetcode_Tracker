// Last updated: 8/16/2026, 8:28:58 AM
1class Solution {
2    public int nearestDrone(int[][] drones, int[] target) {
3        int m=Integer.MAX_VALUE;
4        int a=-1;
5        for(int i=0;i<drones.length;i++){
6            int d=Math.abs(drones[i][0]-target[0]) + Math.abs(drones[i][1]-target[1]);
7            
8            if(d<=drones[i][2]){
9            if(d<m){
10                m=d;
11                a=i;
12            }
13        }
14        }
15        return a;
16    }
17}