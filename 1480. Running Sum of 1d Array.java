class Solution {
    public int[] runningSum(int[] nums) {
        int count =0;
        int[] kas = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            kas[i] = count+nums[i];
            count = kas[i];
        }
        return kas;
    }
}