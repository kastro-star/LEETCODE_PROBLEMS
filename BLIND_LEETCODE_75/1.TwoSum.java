// class Solution {
//   public int[] twoSum(int[] nums, int target) {
//       int[] fin = new int[2];
//       int[] copy=new int[nums.length];
//       for(int i=0;i<nums.length;i++){
//           copy[i] = nums[i];              // copy the given array manually or use clone() --->int[] copy = nums.clone();
//       } 
//       int fir=0,sec=0;
//       Arrays.sort(nums);
//       int left=0,right= nums.length -1;        // Do binary search
//       while(left < right){
//           int sum = nums[left] + nums[right];
//           if(sum == target){
//               fir = nums[left];
//               sec = nums[right];
//               break;
//           }
//           else if(sum <target){
//               left++;
//           }
//           else{
//               right--;
//           }
//       }
//       int tfi=-1,tse=-1;
//       for(int i=0;i<copy.length;i++){
//           if(fir == copy[i] && tfi == -1){
//               tfi=i;                                     // search the actual index
//           }
//           else if(sec == copy[i] && i != tfi ){
//               tse=i;
//           }
//       }
//       fin[0] = tfi;                   // set the answer
//       fin[1] =tse;
//       return fin;
//   }
// }



// class Solution {
//   public int[] twoSum(int[] nums, int target) {
      
//       int n = nums.length;
                                                             // BRUTE FORCE 
//       for(int i = 0; i < n -1; i++){
//           for(int b=1+i; b<n; b++){
//               if(nums[i]+nums[b] == target){
//                   return new int[]{i,b};
//               }
//           }
//       }

//       return new int[]{};
//   }
// }













class Solution {
  public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer> kas = new HashMap<>();
      for(int i =0;i<nums.length;i++){
          int diff = target - nums[i];             // taregt - the current value (is the answer) if you find you get the value
          if(kas.containsKey(diff)){               // every time check it 
              return new int[]{kas.get(diff),i};
          }
          kas.put(nums[i],i);                         // if not add them
      }
      return null;
  }
}