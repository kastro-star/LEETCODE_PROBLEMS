class Solution {
  public boolean squareIsWhite(String coordinates) {
      int fir = (int)coordinates.charAt(0);
      int sec = (int)coordinates.charAt(1);
      int fin = fir+sec;
      if(fin % 2 == 0){
          return false;
      }
      return true;
  }
}