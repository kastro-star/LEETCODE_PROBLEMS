class Solution {
  public int countSubmatrices(int[][] grid, int k) {
      int count =0;
      int m = grid[0].length;
      int[] prefix = new int[m];
      for(int i=0;i<grid.length;i++){
          int rows =0;
          for(int j=0;j<grid[i].length;j++){
              rows += grid[i][j];
              prefix[j] += rows;

              if(prefix[j] <= k ){
                  count++;
              }
          }
      }
      return count;
  }
}