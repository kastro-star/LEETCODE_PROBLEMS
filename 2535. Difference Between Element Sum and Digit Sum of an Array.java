class Solution {
  public int differenceOfSum(int[] nums) {
      int sum=0,single=0;
      for(int i=0;i<nums.length;i++){
          sum += nums[i];
          int n = nums[i];
          if(n > 9){
              int fin=0;
              int nu = nums[i];
              while(nu != 0){
                  fin += nu % 10;
                  nu /= 10;
              }
              single += fin;
          }
          else{
              single += nums[i];
          }
      }
      return sum-single;
  }
}