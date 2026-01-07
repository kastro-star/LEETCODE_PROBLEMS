class Solution {
  public int maxDistinct(String s) {
      return findUniqueSubstringCount(s);
  }

  private int findUniqueSubstringCount(String s){
      int[] kas= new int[26];

      int count = 0;

      for(char ch : s.toCharArray()){
        kas[ch - 'a']++;
          if(kas[ch - 'a'] == 1){ 
            count++;
          }
      }

      return count;
  }
}