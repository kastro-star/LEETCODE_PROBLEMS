class Solution {
  public int lengthOfLastWord(String s) {
       String[] knew =s.split(" ");
      int kas= knew.length-1;
      int kfinal =knew[kas].length();
      return kfinal;
  }
}