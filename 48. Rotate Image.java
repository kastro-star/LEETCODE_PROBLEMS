class Solution {
  public void rotate(int[][] matrix) {
      int n = matrix.length;
      for(int i=0;i<matrix.length-1;i++){
          for(int j=i+1;j<=n-1;j++){
              int temp = matrix[i][j];
              matrix[i][j] = matrix[j][i];
              matrix[j][i] = temp; 
              
          }
      }
      int point =0;
      for(int i=0;i<matrix.length;i++){
          int left =0,right =matrix[0].length-1;
          
          while(left < right){
              int temp = matrix[point][right];
              matrix[point][right] = matrix[point][left];
              matrix[point][left] = temp;
              left++;
              right--;
          }
          point++;
          
      }
  }
}