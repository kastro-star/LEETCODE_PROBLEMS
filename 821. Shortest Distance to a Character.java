class Solution {
  char ges;
  public int[] shortestToChar(String s, char c) {
      ges = c;
      int[] jes = new int[s.length()];
      for(int i=0;i<s.length();i++){
          int val =checking(s,i);
          jes[i] = val;
      }
      return jes;
  }
  public int checking(String kas,int h){
      int count =0,left = h,right=h;
      while(left  >= 0 || right <= kas.length()){
          if(left >=0 && kas.charAt(left) == ges){
               return count;
          }
           if(right <= kas.length()-1 && kas.charAt(right) == ges){
              return count;
          }
          left--;
          right++;
          count++;
      }
     return 0;
  }
}