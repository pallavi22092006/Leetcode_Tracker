// Last updated: 8/11/2026, 2:14:31 PM
import java.util.*;

class Solution {
    public long weightedSum(int[] parent, int[] nums) {
         int n=parent.length;
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int root=-1;
        for(int i=0;i<n;i++){
            if(parent[i]==-1){
                root = i;
            }
            else{
                adj.get(parent[i]).add(i);
            }
        }
        int depth[]=new int[n];
        int mh=0;
        Queue<Integer> q=new LinkedList<>();
        q.add(root);
        depth[root]=1;
        while(!q.isEmpty()){
            int c=q.poll();
            mh=Math.max(mh,depth[c]);
            for(int ne:adj.get(c)){
                depth[ne]=depth[c]+1;
                q.add(ne);
            }
        }
        long totalSum=0;
        for(int i=0;i<n;i++){
            long multiplier=(mh-depth[i]+1);
            totalSum+=(long)nums[i]*multiplier;
            
        }
        return totalSum;
    }
}