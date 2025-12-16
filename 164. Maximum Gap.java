class Solution {
    public int maximumGap(int[] nums) {
        int n= nums.length;
        Arrays.sort(nums);
        int max =0;
        for(int i=1;i<nums.length ;i++){
            int temp = nums[i] - nums[i-1];
            max =Math.max(max,temp);
        }
        return max;
    }
}