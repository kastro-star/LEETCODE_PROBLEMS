class Solution {
  public int sumOfUnique(int[] nums) {
      Set<Integer> kas = new HashSet<>();
      for(int i=0;i<nums.length;i++){
          if(!kas.add(nums[i])){
              if(kas.contains(nums[i])){
                  kas.remove(nums[i]);
              }
          }
      }
      int sum = 0;
      for(int k:kas){
          sum += k;
      }
      return sum;
  }
}

// class Solution {
//     public int sumOfUnique(int[] nums) {
//         int sum=0;
//         for(int i=0;i<nums.length;i++){
//             int count=0;
//             for(int j=0;j<nums.length;j++){
//                 if(nums[i]==nums[j]){
//                     count++;
//                 }
//             }
//             if(count==1){
//                 sum+=nums[i];
//             }
//         }
//         return sum;

//     }
// }
