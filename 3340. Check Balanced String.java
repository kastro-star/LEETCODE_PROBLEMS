class Solution {
  public boolean isBalanced(String num) {
      int evencount =0,oddcount=0;
      for(int i=0;i<num.length();i++){
          int kas = num.charAt(i) - '0';
          if(i % 2 == 0){
              evencount += kas;
          }else{
              oddcount += kas;
          }
      }
      if(oddcount == evencount){
          return true;
      }
      return false;
  }
}