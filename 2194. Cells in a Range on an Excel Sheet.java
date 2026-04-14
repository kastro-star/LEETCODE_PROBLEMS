class Solution {
  public List<String> cellsInRange(String s) {
      ArrayList<String> fina = new ArrayList<>();
      String[] fin =s.split(":");
      String temp1 = fin[1];
      char h = temp1.charAt(0);
      int y = temp1.charAt(1) - '0';
      String temp2 = fin[0];
      char p = temp2.charAt(0);
      int y2 = temp2.charAt(1) - '0';
      for(char i=p;i<=h;i++){
          for(int j=y2;j<=y;j++){
              StringBuilder kas = new StringBuilder();
              kas.append(i);
              kas.append(j);
              fina.add(kas.toString());
          }
      }
      return fina;
  }
}