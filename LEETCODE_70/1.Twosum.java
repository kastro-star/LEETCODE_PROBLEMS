class Solution {
  public int[] twoSum(int[] nums, int target) {
      int[] fin = new int[2];
      int[] copy=new int[nums.length];
      for(int i=0;i<nums.length;i++){
          copy[i] = nums[i];
      }
      int fir=0,sec=0;
      Arrays.sort(nums);
      int left=0,right= nums.length -1;
      while(left < right){
          int sum = nums[left] + nums[right];
          if(sum == target){
              fir = nums[left];
              sec = nums[right];
              break;
          }
          else if(sum <target){
              left++;
          }
          else{
              right--;
          }
      }
      int tfi=-1,tse=-1;
      for(int i=0;i<copy.length;i++){
          if(fir == copy[i] && tfi == -1){
              tfi=i;
          }
          else if(sec == copy[i] && i != tfi ){
              tse=i;
          }
      }
      fin[0] = tfi;
      fin[1] =tse;
      return fin;
  }
}