class Solution {
  public String largestGoodInteger(String num) {
      int count =1;
      char prev = num.charAt(0);
      String jes="";
      StringBuilder kas = new StringBuilder();
      kas.append(prev);
      for(int i=1;i<num.length()  ;i++){
          if(num.charAt(i) == prev){
              count++;
              kas.append(num.charAt(i));
          }else{
              count = 1;
              kas.setLength(0);
               prev = num.charAt(i);
              kas.append(prev);
          }
          if(count == 3){
              String cur = kas.toString();
              if (jes.equals("") || cur.compareTo(jes) > 0) {
                  jes = cur;       
              }
          }
      }
      
      return jes;
  }
}