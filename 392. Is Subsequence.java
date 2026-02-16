class Solution {
  public boolean isSubsequence(String s, String t) {
      int sc=0;
      if(s.length() == 0){
          return true;
      }
      for(int i=0;i<t.length();i++){
          if(sc == s.length()){
              return true;
          }
          if(t.charAt(i) == s.charAt(sc)){
              sc++;
          }
      }
      if(sc == s.length()){
          return true;
      }

      return false;
  }
}