class Solution {
  public String digitSum(String s, int k) {
      int r=s.length();
      while(r > k){
          s= cutting(s,k);
          r = s.length();
      }
      return s;
  }
  public static String cutting(String kas,int l){
      int sum =0,count =0;
      String kast = "";
      for(int i=0;i<kas.length();i++){
          sum += kas.charAt(i) - '0';
          count++;
          if(count == l){
              count =0;
              String temp = String.valueOf(sum);
              kast = kast+temp;
              sum=0;
          }    
      }
      if(count >0){
              String temp = String.valueOf(sum);
              kast = kast+temp;
          }
      return kast;
  }
}