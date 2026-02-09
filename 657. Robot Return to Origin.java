class Solution {
  public boolean judgeCircle(String moves) {
      int u=0,d=0,l=0,r=0;

      for(Character k:moves.toCharArray()){
          if(k == 'U'){
              u++;
              d--;
          }else if(k == 'D'){
              d++;
              u--;
          }else if(k == 'L'){
              l++;
              r--;
          }else if(k == 'R'){
              r++;
              l--;
          }
      }
      if(u == 0 && d == 0 && l == 0 && r == 0){
          return true;
      }
      return false;
  }
}

// class Solution {
//   public boolean judgeCircle(String moves) {
//       int x = 0, y = 0;
//       for(char ch : moves.toCharArray()){
//           if(ch == 'R') x++;
//           else if(ch == 'L') x--;
//           else if(ch == 'U') y++;
//           else y--;
//       }
//       return x == 0 && y == 0;
//   }
// }