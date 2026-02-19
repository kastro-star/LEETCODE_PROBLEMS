class Solution {
  public int maximumValue(String[] strs) {
      int max =0;
      for(int i=0;i<strs.length;i++){
          String t = strs[i];
          boolean h = true;
          for(int k=0;k<t.length();k++){
              if(Character.isLetter(t.charAt(k))){
                  h =false;
                  break;
              }
              int g = t.charAt(k) - '0';
              if(g > max){
                  max = g;
              }
          }
          if(!h){
              if(max < t.length()){
                  max = t.length();
              } 
          }else{
              int j = Integer.parseInt(t);
              if(max < j){
                  max = j;
              }
          }
      }
      return max;
  }
}