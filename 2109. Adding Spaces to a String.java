class Solution {
  public String addSpaces(String s, int[] spaces) {
      int i=0;
      int l=0;
      StringBuilder kas = new StringBuilder();
      for(char k:s.toCharArray()){
          if(i < spaces.length && l == spaces[i]){
              kas.append(' ');
              kas.append(k);
              i++;
              l++;
              continue;
          }
          kas.append(k);
          l++;
      }
      return kas.toString();
  }
}