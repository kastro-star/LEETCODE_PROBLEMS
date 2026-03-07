class Solution {
  public int minOperations(String s) {
      int odd0 = 0;
      int odd1 = 0;
      for(int i=0;i<s.length();i++){
          char m = s.charAt(i);
          if(i%2 == 0){
              if(m == '0'){
                  odd0++;
              }
          }else{
              if(m == '1'){
                  odd0++;
              }  
          }
      }
      for(int i=0;i<s.length();i++){
          char u = s.charAt(i);
          if(i%2 == 1){
              if(u == '0'){
                  odd1++;
              }
          }else{
              if(u == '1'){
                  odd1++;
              }
          }
      }
      return Math.min(odd0,odd1);
  }
}