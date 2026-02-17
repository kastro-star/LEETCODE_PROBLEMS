class Solution {
  public String reverseByType(String s) {
      StringBuilder nor = new StringBuilder();
      StringBuilder spe = new StringBuilder();
      int right = s.length()-1;
      while(right >= 0){
          if(Character.isLetter(s.charAt(right))){
              nor.append(s.charAt(right));
          }else{
              spe.append(s.charAt(right));
          }
          right--;
      }
      StringBuilder fin = new StringBuilder();
      int h=0,l=0;
      for(int i=0;i<s.length();i++){
          if(Character.isLetter(s.charAt(i))){
              fin.append(nor.charAt(h++));
          }else{
              fin.append(spe.charAt(l++));
          }
      }
      return fin.toString();
  }
}