class Solution {
  public String defangIPaddr(String address) {
      StringBuilder kas= new StringBuilder();
      for(Character k :address.toCharArray()){
          if(k == '.'){
              kas.append("[.]");
              continue;
          }
          kas.append(k);
      }
      return kas.toString();
  }
}