class Solution {
  public int[][] sortMatrix(int[][] grid) {
      HashMap<Integer,PriorityQueue<Integer>> main = new HashMap<>();
      int row = grid.length;
      for(int i=0;i<row;i++){
          for(int j=0;j<row;j++){
              int key = i-j;
              main.putIfAbsent(key,key < 0 ? new PriorityQueue<>() :
              new PriorityQueue<>(Collections.reverseOrder()));
              main.get(key).offer(grid[i][j]);
          }
      }
      for(int i=0;i<row;i++){
          for(int j=0;j<row;j++){
              int key = i-j;
              grid[i][j] = main.get(key).poll();
          }
      }
      return grid;
  }
}