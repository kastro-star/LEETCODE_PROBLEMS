class Solution {
  public String greatestLetter(String s) {
      int[] lower = new int[26];
      int[] upper = new int[26];
      for(char l:s.toCharArray()){
          if(Character.isUpperCase(l)){
              upper[l - 'A']++;
          }
          if(Character.isLowerCase(l)){
              lower[l - 'a']++;
          }
         
      }
      for(int i =25;i>=0;i--){
          if (upper[i] > 0 && lower[i] > 0) {
              int val = i;
              char jes = (char)(val + 'A');
              return String.valueOf(jes);
              
          }

      }
      
      return "";
  }
}
// class Solution {
//   public String greatestLetter(String s) {
      
//       for(int i='z';i>='a';i--){
//           String low=Character.toString(i);
//           String upper=Character.toString(i-32);

//           if(s.contains(low)&&s.contains(upper)){
//               return upper;
//           }
//       }
//       return "";
//   }
// }