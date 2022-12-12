class Solution {
    public int[] runningSum(int[] nums) {
        int l = nums.length;
        int nums2[] = new int[l];
        for(int i=0;i<l;i++){
            if(i==0){
               nums2[i] = nums[i]; 
            }
            if(i>=1){
            nums2[i] = nums[i-1] +nums[i];
            nums[i] = nums[i-1] + nums[i];
            }
        }
     return nums2;
    }
}