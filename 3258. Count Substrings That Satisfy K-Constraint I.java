class Solution {
  public int countKConstraintSubstrings(String s, int k) {
      int ans =0;
      int zerocount =0;
      int onescount =0;
      for(int right =0,left=0;right <s.length();right++){
          char t = s.charAt(right);
          if(t == '0'){
              zerocount++;
          }else{
              onescount++;
          }
          while(zerocount > k && onescount >k){
              if(s.charAt(left) == '0'){
                  zerocount--;
              }else{
                  onescount--;
              }
              left++;
          }
          ans += right - left +1;
      }
      return ans;
  }
}