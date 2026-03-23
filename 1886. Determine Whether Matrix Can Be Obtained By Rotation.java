class Solution {
  public boolean findRotation(int[][] mat, int[][] target) { 
      for(int i=0;i<4;i++){
          if(check(mat,target)){
              return true;
          }
          mat = rotate(mat);
      }
      return false;
  }
  private int[][] rotate(int[][]mat){
      int[][] ne = new int[mat.length][mat[0].length];
      int n = mat[0].length;
      for(int i=0;i<mat.length;i++){
          for(int j=0;j<mat[i].length;j++){
              ne[j][n-i-1] = mat[i][j];
          }
      }
      return ne;
  }
  private boolean check(int[][] ne ,int[][] target){
      for(int i=0;i<ne.length;i++){
          for(int j=0;j<ne[0].length;j++){
              if(target[i][j] != ne[i][j]){
                  return false;
              }
          }
      }
      return true;
  }
}