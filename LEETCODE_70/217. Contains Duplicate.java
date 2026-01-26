package LEETCODE_70;
class Solution {
  public boolean containsDuplicate(int[] nums) {
      for(int i=0;i<nums.length;i++){
          for(int j=i+1;j<nums.length;j++){
              if(nums[i] == nums[j]){
                  return true;
              }
          }
      }
      return false;
  }
}

// class Solution {
//   public boolean containsDuplicate(int[] nums) {
//       Set<Integer> kas =new HashSet<>();
//       for(int i=0;i<nums.length;i++){
//           if(kas.contains(nums[i])){
//               return true;
//           }
//           kas.add(nums[i]);
//       }

//       return false;
      
//   }
// }