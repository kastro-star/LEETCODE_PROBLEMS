class Solution {
  public String makeFancyString(String s) {
      Stack<Character> kas = new Stack<>();
      int count =0;
      for(int i=0;i<s.length();i++){
          if(kas.isEmpty()){
              kas.push(s.charAt(i));
              continue;
          }
          if(kas.peek() == s.charAt(i)){
              count++;
              if(count >= 2){
                  continue;
              }else{
                  kas.push(s.charAt(i));
                  
              }
          }else{
              kas.push(s.charAt(i));
              count =0;
          }
      }
      StringBuilder kds = new StringBuilder();
      for(Character k:kas){
          kds.append(k);
      }
      return kds.toString();
  }
}

// class Solution {
//   public String makeFancyString(String s) {
//       StringBuilder res=new StringBuilder();
//       int count=0;
//       for(int i=0;i<s.length();i++){
//           if(i>0 && s.charAt(i)==s.charAt(i-1)){
//               count++;
//           }
//           else count=1;

//           if(count<=2) res.append(s.charAt(i));
//       }
//       return res.toString();
//   }
// }