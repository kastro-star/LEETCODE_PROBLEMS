class Solution {
  public int[] minOperations(String boxes) {
      int[] res = new int[boxes.length()];
      int pre = 0,count =0;
      for(int i=0;i<boxes.length();i++){
          res[i] += pre;
          count += boxes.charAt(i) -'0';
          pre +=count;
      }

      pre=0;
      count=0;

      for(int j=boxes.length() -1;j>-1;j--){
          res[j] +=pre;
          count += boxes.charAt(j) - '0';
          pre += count;
      }
      return res;
  }
}