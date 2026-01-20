// class Solution {
//   public int diagonalSum(int[][] mat) {
//       int prisum =0,secsum=0;
//       for(int i=0;i<mat.length;i++){
//           for(int j=0;j<mat[i].length;j++){
//               if(j == i && j != mat[i].length - 1-i ){
//                   prisum += mat[i][j];
//               }
//               if( j == mat[i].length - 1-i ){
//                   secsum += mat[i][j];
//               }
//           }
//       }
//       return prisum+secsum;

//   }
// }

class Solution {
  public int diagonalSum(int[][] mat) {
      int n = mat.length;
      int sum = 0;
      for (int i = 0; i < n; i++) {
          sum += mat[i][i];          
          if (i != n - 1 - i) {
              sum += mat[i][n - 1 - i]; 
          }
      }
      return sum;
  }
}