class Solution {
  public int[] diStringMatch(String s) {
      int n = s.length();
      int y = n,index =0,val=0;
      int[] res = new int[n+1];
      for(int i=0;i<s.length();i++){
          if(s.charAt(i) == 'I'){
              res[index++] =val++;
          }else{
              res[index++] = y--;
          }
      }
      res[n] =val;
      return res;
  }
}