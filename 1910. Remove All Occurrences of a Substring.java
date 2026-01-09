class Solution {
  public String removeOccurrences(String s, String part) {
      char[] input = s.toCharArray();
      char[] party = part.toCharArray();
      char[] result = new char[input.length];
      int stacksize = 0,targetsize = party.length-1;
      char targetend = party[targetsize];
      for(char current :input){
          result[stacksize++] = current;
          if(current == targetend && stacksize >= targetsize +1 ){
          int i =stacksize -1,j = targetsize;
          while(j >=0 && result[i] == party[j]){
              i--;
              j--;
          }
          if(j < 0){
              stacksize = i+1;
          }
          }
      }
      String h = new String(result,0,stacksize);
      return h;
  }
}