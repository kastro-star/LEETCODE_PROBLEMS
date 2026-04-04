class Solution {
  public List<String> stringSequence(String target) {
      ArrayList<String> fin = new ArrayList<>();
      StringBuilder kas = new StringBuilder();
      int n = target.length();
      int i=0;
      while(i<n){
          kas.append('a');
          fin.add(kas.toString());

          while(kas.charAt(kas.length()-1) != target.charAt(i)){
              kas.setCharAt(kas.length()-1,(char)(kas.charAt(kas.length()-1)+1));
              fin.add(kas.toString());
          }
          i++;

      }  
      return fin;
  }


}