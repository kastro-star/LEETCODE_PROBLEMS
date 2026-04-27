class Solution {
  public String mapWordWeights(String[] words, int[] weights) {
      StringBuilder kas = new StringBuilder();
      for(String k:words){
          int y = val(k,weights) % 26;
          char result = (char) ('z' - y);
          kas.append(result);  
      }
      return kas.toString();
  }
  int val(String k,int[] weights){
      int y=0;
      for(int i=0;i<k.length();i++){
          int p = k.charAt(i)- 'a';
          y = y+weights[p];
      }
      return y;
  }
}