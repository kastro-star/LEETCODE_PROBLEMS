class Solution {
  public String[] divideString(String s, int k, char fill) {
      int n=s.length();
      int h = (n+k-1)/k;
      String[] kas = new String[h];
      for(int i=0;i<h;i++){
          StringBuilder kasr = new StringBuilder();
          for(int j=0;j<k;j++){
              int index = i*k+j;
              if(index <n){
                  kasr.append(s.charAt(index));
              }
              else{
                  kasr.append(fill);
              }
          }
          kas[i] = kasr.toString();
      }
      return kas;
  }
}