class Solution {
  public void moveZeroes(int[] nums) {
      int size=0;
      int zero=nums.length-1;
      for(int i=0;i<nums.length;i++){
          if(nums[i]!=0){
              nums[size++]=nums[i];
          }   
      }
      for(int j=size;j<nums.length;j++){
          nums[j]=0;
      }
      
  }
}