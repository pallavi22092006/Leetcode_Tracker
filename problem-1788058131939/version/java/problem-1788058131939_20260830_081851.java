// Last updated: 8/30/2026, 8:18:51 AM
1class Solution {
2    public int countSpecialIntegers(int[] nums) {
3        Set<Integer> seen=new HashSet<>();
4        Set<Integer> spl=new HashSet<>();
5        for(int i=0;i<nums.length;i++){
6            if(i==0||nums[i]!=nums[i-1]){
7                if(seen.contains(nums[i])){
8                    spl.remove(nums[i]);
9                }
10                else{
11                    seen.add(nums[i]);
12                    spl.add(nums[i]);
13                }
14            }
15        }
16        return spl.size();
17    }
18}