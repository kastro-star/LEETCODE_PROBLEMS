class Solution {
  public String generateTheString(int n) {
      if( n  % 2 != 0){
          StringBuilder kas = new StringBuilder();
          for(int i =0;i<n;i++){
              kas.append('a');
          }
          return kas.toString();
      }
      StringBuilder odd = new StringBuilder();
      for(int i =0;i<n-1;i++){
          odd.append('a');
      }
      odd.append('b');
      return odd.toString();
  }
}