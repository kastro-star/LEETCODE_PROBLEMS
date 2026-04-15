class Solution {
  public int closestTarget(String[] words, String target, int startIndex) {
      int y=Integer.MAX_VALUE;
      int n =words.length;
      for(int i=0;i<words.length;i++){
          if(words[i].equals(target)){
              int clockwise =(i -  startIndex+n)%n;
              int anticlockwise = (startIndex - i+n)%n;
              y = Math.min(y,Math.min(clockwise,anticlockwise));
          }
      }
      if(y == Integer.MAX_VALUE){
          return -1;
      }
      return y;
  }
}