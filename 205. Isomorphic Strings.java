class Solution {
  public boolean isIsomorphic(String s, String t) {
      HashMap<Character,Character> kas = new HashMap<>();
      HashMap<Character,Character> jes = new HashMap<>();
      for(int i=0;i<s.length();i++){
          if(kas.containsKey(s.charAt(i))){
              Character k = kas.get(s.charAt(i));
              if(k == t.charAt(i)){
                      continue;
              }else{
                  return false;
              }
          }else{
              kas.put(s.charAt(i),t.charAt(i));
          }

          if(jes.containsKey(t.charAt(i))){
              Character f = jes.get(t.charAt(i));
              if(f == s.charAt(i)){
                  continue;
              }else{
                  return false;
              }
          }
          else{
              jes.put(t.charAt(i),s.charAt(i));
          }
      }
      return true;
  }
}