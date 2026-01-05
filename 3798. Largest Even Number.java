class Solution {
  public String largestEven(String s) {
      int i = s.length() - 1;
      StringBuilder kas = new StringBuilder(s);
      while(i >= 0 && kas.charAt(i) != '2'){
          i--;
      }

      return kas.substring(0,i+1).toString();
  }
}