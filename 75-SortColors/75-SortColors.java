// Last updated: 8/11/2026, 2:15:34 PM
class Solution {
    public void sortColors(int[] nums) {
        int i,c=0,c1=0;
       // int nums[]=new int[nums.length];
        for(i=0; i<nums.length; i++) {
			//arr[i]=sc.nextInt();
			if(nums[i]==0)
				c++;
				else if(nums[i]==1)
				c1++;
		}
		for(i=0; i<c; i++) {
			nums[i]=0;
			System.out.print(nums[i]+" ");
		}
		for(i=c; i<c+c1; i++) {
			nums[i]=1;
			System.out.print(nums[i]+" ");
		}
		for(i=c+c1; i<nums.length; i++) {
			nums[i]=2;
			System.out.print(nums[i]+" ");
        }
    }
}