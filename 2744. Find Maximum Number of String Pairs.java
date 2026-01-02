class Solution {
  public int maximumNumberOfStringPairs(String[] words) {
      int count =0;
      for(int i=0;i<words.length;i++){
          String out = words[i];
          for(int j=i+1;j<words.length;j++){
              String inn = words[j];
              if(out.charAt(0) == inn.charAt(0) && out.charAt(1) == inn.charAt(1)){
                  count++;
              }
              else if(out.charAt(1) == inn.charAt(0) && out.charAt(0) == inn.charAt(1)){
                  count++;
              }
          }
      }
      return count;
  }
}