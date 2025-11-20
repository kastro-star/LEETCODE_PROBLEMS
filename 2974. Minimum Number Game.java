class Solution {
    public int[] numberGame(int[] nums) {
        // if you use arrays.sort we can solve this problem in o(nlogn) time complexity
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = 0; j < nums.length - 1; j++) {
                if(nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        for(int k = 0; k < nums.length - 1; k += 2) {
            int temp = nums[k];
            nums[k] = nums[k + 1];
            nums[k + 1] = temp;
        }
        return nums;
    }
}