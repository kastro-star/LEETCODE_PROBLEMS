class Solution {
  public int getMinDistance(int[] nums, int target, int start) {
      int x=Integer.MAX_VALUE;
      for(int i=0;i<nums.length;i++){
          if(nums[i] == target){
              int temp = Math.abs(i - start);
              if(x > temp){
                  x =temp;
              }
          }
      }
      return x;
  }
}