class Solution {
  public List<Integer> findDisappearedNumbers(int[] nums) {
      int n = nums.length;
      boolean[] kas = new boolean[n+1];
      for(int i=0;i<nums.length;i++){
          kas[nums[i]] = true;
      }
      List<Integer> jes =  new ArrayList<>();
      for(int i=1;i<=nums.length;i++){
          if(!kas[i]){
              jes.add(i);
          }
      }
      return jes;
  }
}