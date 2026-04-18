class Solution {
  public int mirrorDistance(int n) {
      int y =n;
      int rev=0;
      while(y!=0){
          int z = y%10;
          rev = rev*10+z;
          y = y/10;
      }
      int fin = Math.abs(n - rev);
      return fin;
  }
}