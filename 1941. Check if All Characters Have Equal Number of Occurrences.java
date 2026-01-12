class Solution {
  public boolean areOccurrencesEqual(String s) {
      Set<Character> kasd = new HashSet<>();
      int[] kas = new int[26];
      for(int i=0;i<s.length();i++){
          int k=s.charAt(i) - 'a';
          kasd.add(s.charAt(i));
          kas[k]++;
      }
      if(kasd.size() == 1){
          return true;
      }
      int x=0;
      for(int i=0;i<kas.length;i++){
          if(kas[i] != 0 && x == 0){
              x = kas[i];
          }
          else if (kas[i] != 0){
              if(kas[i] != x){
                  return false;
              }
          }
         
      }
      return true;
  }
}