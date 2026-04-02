class Solution {
  public int garbageCollection(String[] garbage, int[] travel) {
      int total =0;
      int lap=0,lag=0,lam=0;
      for(int i=0;i<garbage.length;i++){
          String temp = garbage[i];
          total+=temp.length();
              if(temp.contains("G")){
                  lag=i;
              }
              if(temp.contains("P")){
                  lap=i;
              }
              if(temp.contains("M")){
                  lam=i;
              }
      }
       for(int i=0;i<lag;i++){
              total +=travel[i];
          }
          for(int i=0;i<lap;i++){
              total +=travel[i];
          }
          for(int i=0;i<lam;i++){
              total +=travel[i];
          }
      return total;



  }
}