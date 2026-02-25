class Solution {
  public boolean digitCount(String num) {
      int freq[] = new int[26];
      for(int i=0;i<num.length();i++){
          int y = num.charAt(i) - '0';
          freq[y]++;
      }
      for(int i=0;i<num.length();i++){
          int y = num.charAt(i) - '0';
          if(freq[i] == y ){
              continue;
          }
              return false;
          
      }
      return true;
  }
}