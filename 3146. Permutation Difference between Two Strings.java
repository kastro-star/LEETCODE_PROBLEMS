class Solution {
  public int findPermutationDifference(String s, String t) {
      int count =0;
      for(int i=0;i<s.length();i++){
          char temp = s.charAt(i);
          int val=0;
          for(int j=0;j<t.length();j++){
              if(temp == t.charAt(j)){
                  val = Math.abs(i-j);
                  break;
              }
          }
          count = count+val;
      }
      return count;
  }
}