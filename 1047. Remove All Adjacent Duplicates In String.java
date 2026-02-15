class Solution {
  public String removeDuplicates(String s) {
      StringBuilder kast = new StringBuilder();

    
      Stack<Character> kas = new Stack<>();
      for(int i=0;i<s.length();i++){
          if(!kas.empty()){
              if(kas.peek() == s.charAt(i)){
                  kas.pop();
              }else{
                  kas.push(s.charAt(i));
              }
          }
          else{
              kas.push(s.charAt(i));

          }
      }
      while(!kas.empty()){
          kast.append(kas.pop());
      }
      kast.reverse();
      String k = kast.toString();
      return k;
  }
}
