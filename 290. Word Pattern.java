class Solution {
  public boolean wordPattern(String pattern, String s) {
      HashMap<Character , String> kas = new HashMap<>();
      String[] spi = s.split("\\s+");
      if(pattern.length() != spi.length){
          return false;
      }
      for(int i=0;i<pattern.length();i++){
          Character r=pattern.charAt(i);
          if(kas.containsKey(r)){
              if(!kas.get(r).equals(spi[i])){
                  return false;
              }
          }
          else{
              if(kas.containsValue(spi[i])){
                  return false;
              }
              kas.put(r,spi[i]);
          }
      }
      return true;
  }
}