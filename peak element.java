class Solution {
    public int findPeakElement(int[] nums) {
        int peak=nums[0];
        int a=0;

        for(int i=1;i<nums.length;i++){
            if(nums[i]>peak){
                peak=nums[i];
                a=i;
            }
        }
        return a;
    }
}