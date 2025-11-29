class Solution {
    public int minOperations(int[] nums, int k) {
        int val=0;
        for(int i=0;i<nums.length;i++){
            val+=nums[i];
        }
        return val % k;
    }
}
