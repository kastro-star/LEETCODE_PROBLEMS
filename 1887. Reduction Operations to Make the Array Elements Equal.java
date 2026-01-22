class Solution {
  public int reductionOperations(int[] nums) {
      Arrays.sort(nums);
      int check=nums[0],ans=0,size=0;
      for(int i:nums){
          if(i != check){
              check =i;
              size++;
          }
          ans=ans+size;
      }
      return ans;
  }
}