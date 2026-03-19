class Solution {
  public int numberOfSubmatrices(char[][] grid) {
      int m = grid[0].length;
      int[] sumX = new int[m];
      int[] sumY = new int[m];
      int fin=0;
      for(int i=0;i<grid.length;i++){
          int rx =0,ry=0;
          for(int j=0;j<m;j++){
              char temp = grid[i][j];
              if(temp == 'X'){
                  rx++;
              }else if(temp == 'Y'){
                  ry++;
              }

              sumX[j] +=rx;
              sumY[j] +=ry;

              if(sumX[j] >0 && sumX[j] == sumY[j]){
                  fin++;
              }

          }
      }
      return fin;
  }
}