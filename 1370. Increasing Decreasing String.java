class Solution {
  public String sortString(String s) {
      int[] kass = new int[26];
      StringBuilder kast = new StringBuilder();
      for(int i =0;i<s.length();i++){
          int temp = s.charAt(i) - 'a';
          kas[temp]++;
      }
      while(kast.length() < s.length()){
          int small =0,large =kas.length -1;
          while(small < kas.length){
              if(kas[small] >0){
                  kast.append((char) ('a' + small));
                  kas[small]--;
              }
              small++;
          }
          while(large >= 0){
              if(kas[large] >0){
                  kast.append((char) ('a' + large));
                  kas[large]--;
              }
               large--;
          }
      }
      return kast.toString();
  }
}
