class Solution {
  public int maxDistance(int[] colors) {
      int n = colors.length-1;
      int temp = 0;
      for(int i=0;i<colors.length;i++){
          if(colors[i] != colors[0]){
              int u= Math.abs(i-0);
              if(temp <u){
                  temp =u;
              }
          }
          if(colors[i] != colors[n]){
              int y = Math.abs(i-n);
              System.out.print(temp);
              if(y > temp){
                  temp =y;
              }  
                                       
          }
          }
      return temp;
  }
}