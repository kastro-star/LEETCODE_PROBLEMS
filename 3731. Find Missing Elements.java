class Solution {
  public List<Integer> findMissingElements(int[] nums) {
      List<Integer> lis = new ArrayList<>();
      int min = nums[0];
      int max = nums[0];
      boolean[] seen = new boolean[101];

      for(int n : nums){
          min = Math.min(min,n);
          max = Math.max(max,n);
          seen[n] = true;
      }

      for(int i = min; i<=max; i++){
          if(!seen[i]){
              lis.add(i);
          }
      }
      return lis;
  }
}