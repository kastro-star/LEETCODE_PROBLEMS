class Solution {
  public int earliestTime(int[][] tasks) {
      int min = 202;
      for(int i =0;i<tasks.length;i++){
              int temp =tasks[i][0] + tasks[i][1] ;
              if(min > temp){
                  min = temp;
              }  
      }
      return min;
  }
}