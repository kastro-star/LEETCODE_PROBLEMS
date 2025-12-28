class Solution {
  public boolean hasSameDigits(String s) {
      
      while(s.length() > 2){
          StringBuilder kas = new StringBuilder();
          for(int i=0;i<s.length() -1;i++){
              int fir = s.charAt(i) - '0';
              int sec = s.charAt(i+1) - '0';
              int res = (fir + sec ) % 10;
              kas.append(res);
          }
          s = kas.toString();
      }
      return s.charAt(0) == s.charAt(1);
  }
}