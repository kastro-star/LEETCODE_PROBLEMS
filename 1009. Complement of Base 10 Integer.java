class Solution {
  public int bitwiseComplement(int n) {
      String j = Integer.toBinaryString(n);
      StringBuilder k = new StringBuilder();
      for(int i=0;i<j.length();i++){
          if(j.charAt(i) == '0'){
              k.append('1');
          }else{
              k.append('0');
          }
      }
      String h = k.toString();
      int d = Integer.parseInt(h,2);
      return d;
  }
}