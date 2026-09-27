// Last updated: 9/27/2026, 8:41:19 AM
1import java.util.*;
2class Solution {
3    public int maxEqualAdjacentPairs(int[] nums) {
4        if(nums==null||nums.length<=1)
5            return 0;
6        int base=0;
7        Map<Long,Integer> p=new HashMap<>();
8        int max=0;
9        for(int i=0;i<nums.length-1;i++){
10            int a=nums[i];
11            int b=nums[i+1];
12            if(a==b)
13              base++;
14            else{
15                int min=Math.min(a,b);
16                int ma=Math.max(a,b);
17                Long k=((long)min<<32)|(ma & 0xFFFFFFFFL);
18                int count=p.getOrDefault(k,0)+1;
19                p.put(k,count);
20                if(count>max)
21                   max=count;
22            }
23        }
24        return base+max;
25    }
26}