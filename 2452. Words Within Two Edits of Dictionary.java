class Solution {
  public List<String> twoEditWords(String[] queries, String[] dictionary) {
      ArrayList<String> fin = new ArrayList<>();
      for(String k:queries){
          if(check(k,dictionary)){
              fin.add(k);
          }
      }
      return fin;
  }

  boolean check(String wor,String[] dictionary){
      boolean found =false;
      for(int i=0;i<dictionary.length;i++){
          String temp = dictionary[i];
          int sum=2;
          for(int j=0;j<temp.length();j++){
              
              if(temp.charAt(j) != wor.charAt(j)){
                  sum--;
              }
              if(sum<0){
                  break;
              }
          }
          if(sum >=0){
              return true;
          }

      }
      return found;
  }
}