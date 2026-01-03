class Solution {
  public String mergeAlternately(String word1, String word2) {
      StringBuilder kas = new StringBuilder();
      int fir = word1.length(),sec = word2.length();
      int fcount=0,scount=0;
      while( fir >fcount || sec >scount){
          if(fcount < fir){
              kas.append(word1.charAt(fcount++));
          }
          if(scount < sec){
              kas.append(word2.charAt(scount++));
          }
      }
     return kas.toString();
  }
}
