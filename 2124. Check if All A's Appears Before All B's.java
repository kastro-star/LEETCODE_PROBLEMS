class Solution {
  public boolean checkString(String s) {
      boolean kas = false;
      for(int i=0;i<s.length();i++){
          if(s.charAt(i) == 'b'){
              kas = true;
              continue;
          }
          if(kas){
              return false;
          }
      }
      return true;
  }
}