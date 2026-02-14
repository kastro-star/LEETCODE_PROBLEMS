class Solution {
  public boolean areNumbersAscending(String s) {
      int val = -1,i=0;
      while(i<s.length() ){
          if(Character.isDigit(s.charAt(i))){
              int temp =0;
              while(i<s.length() && Character.isDigit(s.charAt(i))){
                  temp = temp * 10 +(s.charAt(i) - '0');
                  i++;
              }
              if(val >= temp){
                  return false;
              }
              val = temp;
          }else{
              i++;
          }
      }
      return true;
  }
}