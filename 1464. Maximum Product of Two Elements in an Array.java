class Solution {
  public int maxProduct(int[] nums) {
      int fir =0,sec=0;
      for(int i=0;i<nums.length;i++){
          if(nums[i] >fir){
              sec = fir;
              fir = nums[i];
          }else if(nums[i] > sec && nums[i] <= fir){
              sec = nums[i];
          }
      }
      int val = (fir - 1) * (sec - 1);
      return val;
  }
}