class Solution {
  public String freqAlphabets(String s) {
      StringBuilder kas = new StringBuilder();
      int i =s.length()-1;
      while(i>=0){
          String temp ="";
          if(s.charAt(i) == '#'){
              temp = temp+s.charAt(i-2);
              temp = temp+s.charAt(i-1);
              int u =Integer.parseInt(temp);
              char p =(char)('a'+u-1);
              kas.append(p);
              i =i-3;
              // System.out.println(p);
              continue;
          }
          int m =s.charAt(i) - '0';
          char t =(char)('a'+m-1);
          kas.append(t);
          System.out.println(t);
          i--;
      }
      return kas.reverse().toString();
  }
}