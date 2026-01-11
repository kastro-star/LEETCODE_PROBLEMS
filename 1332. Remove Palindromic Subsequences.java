class Solution {
  public boolean check(String h){
      int left=0,right=h.length() -1;
      while(left <right){
          if(h.charAt(left++) != h.charAt(right--)){
              return false;
          }
      }
      return true;
  }
  public int removePalindromeSub(String s) {
      if(check(s)){
          return 1;
      }
      else{
          return 2;
      }
  }
}