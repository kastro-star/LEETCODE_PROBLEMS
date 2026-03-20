class Solution {
  public int secondHighest(String s) {
      StringBuilder kas= new StringBuilder();
      String[] p = s.split("[a-z]");
      for(String h:p){
          kas.append(h);
      }
      String j = kas.toString();
      int fir=-1,sec=-1;
      for(int i=0;i<j.length();i++){
          int l = j.charAt(i)-'0';
          if(l >fir){
              sec = fir;
              fir =l;
              
          }else if(l >sec && (l != fir && l<fir)){
              sec =l;
          }
      }
      return sec;
      
  }
}