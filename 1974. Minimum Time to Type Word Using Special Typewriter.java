class Solution {
  public int minTimeToType(String word) {
      int ans = 0;
      int pointer = 'a';
      for(char k :word.toCharArray()){
          int clockwise = Math.abs(k - pointer);
          int anticlk = 26 - clockwise;
          ans += Math.min(clockwise , anticlk)+1;
          pointer = k;
      }
      return ans;
  }
}