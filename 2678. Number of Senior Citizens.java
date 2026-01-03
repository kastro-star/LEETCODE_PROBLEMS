class Solution {
  public int countSeniors(String[] details) {
      int count =0;
      for(int i =0;i<details.length;i++){
          String kas =details[i];
          String fir =String.valueOf(kas.charAt(11));
          String sec =String.valueOf(kas.charAt(12));
          String fin = fir+sec;
          int finin = Integer.parseInt(fin);
          if(finin > 60){
              count++;
          }
      }
      return count;
  }
}