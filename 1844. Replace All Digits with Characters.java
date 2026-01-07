class Solution {
  public String replaceDigits(String s) {
      char[] kas = new char[26];
      for(int i=0;i<26;i++){
          kas[i] = (char) ('a'+ i);
      }
      char[] das=s.toCharArray();
      for(int i=1;i<das.length;i += 2 ){
         
          
              int temp = s.charAt(i) - '0';
              das[i] =(char)(das[i-1 ] +temp);
          
      }
      String alphabet = new String(das);
      return alphabet;
  }
}