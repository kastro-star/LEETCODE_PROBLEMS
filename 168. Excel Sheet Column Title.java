class Solution {
  public String convertToTitle(int columnNumber) {
      StringBuilder kas = new StringBuilder();
      while(columnNumber>0){
          columnNumber--;
          int cur = columnNumber%26;
          columnNumber = columnNumber/26;
          kas.append((char)(cur +'A'));

      }
      return kas.reverse().toString();
  }
}