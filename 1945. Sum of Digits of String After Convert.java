class Solution {
  public int getLucky(String s, int k) {
      String val = s;
      val = changingc(val);
      while(k != 0){
          val = changingi(val);
          k--;
      }
      return Integer.parseInt(val);
  }
  public String changingc(String l){
      StringBuilder kas = new StringBuilder();
      for(char k :l.toCharArray()){
          kas.append(k - 'a' +1);       // char - 'a' +1 ----> used to convert char(alphabet) to integer(0 to 9)
      }
      return kas.toString();
  }
  public String changingi(String l){
      int sum=0;
      for(int i=0;i<l.length();i++){
          int temp = l.charAt(i) - '0';   // char - '0' ----> used to convert char(Int) to int(0 to 9)  Dont do typecast because 
          sum =sum+temp; 
      }
      return String.valueOf(sum);
  }
}