class Solution {
  public String makeSmallestPalindrome(String s) {
      StringBuilder kas = new StringBuilder(s);
      int left =0,right= s.length() -1;
      while(left < right){
          char l = s.charAt(left);
          char k = s.charAt(right);
          if(l != k){
              char min =l;
              if(l < k){
                  min= l;
              }else{
                  min = k; 
              }
              kas.setCharAt(left,min);
              kas.setCharAt(right,min);
          }
           left++;
          right--;
      }
      return kas.toString();
  }
}