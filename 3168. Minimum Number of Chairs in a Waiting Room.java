class Solution {
  public int minimumChairs(String s) {
      Stack<Integer> kas = new Stack<>();
      int n = 0;
      for(int i=0;i<s.length();i++){
          if(s.charAt(i) == 'E'){
              kas.push(1);
              int k = kas.size();
              if(k > n){
                  n = k;
              }
          }
          else{
              kas.pop();
          }
      }
      return n;
  }
}