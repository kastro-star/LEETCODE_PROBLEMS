class Solution {
  public String removeStars(String s) {
      StringBuilder kas = new StringBuilder();
      Stack<Character> jes = new Stack<>(); 
      for(int i=0;i<s.length();i++){
          if(s.charAt(i) == '*'){
              if(!jes.isEmpty()){
              jes.pop();
              continue;
              }
          }
          jes.push(s.charAt(i));
      }
      while(!jes.isEmpty()){
          kas.append(jes.pop());
      }
      kas.reverse();
      return kas.toString();
  }
}