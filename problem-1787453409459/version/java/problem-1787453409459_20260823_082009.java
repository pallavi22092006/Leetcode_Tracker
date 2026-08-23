// Last updated: 8/23/2026, 8:20:09 AM
1class Solution {
2    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
3        List<List<Integer>> r=new ArrayList<>();
4        Arrays.sort(nums);
5        long n=lower;
6        for(int num:nums){
7            if(num<lower)
8                continue;
9            if(num>upper)
10                break;
11            if(num>n){
12                r.add(Arrays.asList((int)n,num-1));
13            }
14            n=(long)num+1;
15        }
16        if(n<=upper){
17            r.add(Arrays.asList((int)n,upper));
18        }
19        return r;
20    }
21}