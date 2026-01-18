class Solution {
  public boolean halvesAreAlike(String s) {
      int n = s.length() /2;
      char[] kas = s.toCharArray();
      int fircount=0,seccount=0;
      for(int i=0;i<kas.length;i++){
          char k = kas[i];
          if(n > i){
              if(k =='a' || k =='e' || k =='i' || k == 'o' || k == 'u' || k == 'A' || k == 'E' || k =='I' || k=='O' || k=='U'){
                  fircount++;
              }
          }else{
              if(k =='a' || k =='e' || k =='i' || k == 'o' || k == 'u' || k == 'A' || k == 'E' || k =='I' || k=='O' || k=='U'){
                  seccount++;
              }
          }
      }
      if(fircount != seccount){
          return false;
      }
      return true;
  }
}