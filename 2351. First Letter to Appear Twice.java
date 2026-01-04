class Solution {
  public char repeatedCharacter(String s) {
      int[] kas= new int[26];
      for(int i=0;i<s.length();i++){
          int k = s.charAt(i) - 'a';
          kas[k]++;
          if (kas[k] == 2) {
              return s.charAt(i);
          }
      }
      
      char h= ' ';
      return h;
  }
}