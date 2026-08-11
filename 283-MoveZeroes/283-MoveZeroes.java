// Last updated: 8/11/2026, 2:15:18 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int i,c=0,c1=0;
        int n= nums.length;
        for(i=0;i<n;i++){
            if(nums[i]!=0){
               nums[c]=nums[i];
		       c++;
            }
        }
        for(i=c;i<n;i++){
            nums[i]=0;
        }
        for(i=c;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }
}