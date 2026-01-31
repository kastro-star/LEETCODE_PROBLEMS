class Solution {
  public int percentageLetter(String s, char letter) {
      int count =0;
      for(char k:s.toCharArray()){
          if(k == letter){
              count++;
          }
      }
      int fin = count*100;
      int res = fin/s.length();
      return res;
  }

}