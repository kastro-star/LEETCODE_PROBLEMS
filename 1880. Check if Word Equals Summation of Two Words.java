class Solution {
  public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
      String fir="";
      for(char k:firstWord.toCharArray()){
         int  temp = k - 'a';
         fir = fir.concat(String.valueOf(temp));
      }
      String sec ="";
      for(char l:secondWord.toCharArray()){
          int se =l-'a';
          sec  = sec.concat(String.valueOf(se));
      }
      String tar ="";
      for(char j:targetWord.toCharArray()){
          int ta = j - 'a';
          tar = tar.concat(String.valueOf(ta));
      }
      int v = Integer.parseInt(fir) + Integer.parseInt(sec);
      if(v == Integer.parseInt(tar)){
          return true;
      }
      return false;
  }
}


// class Solution {
//   public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {

//       return getInt(firstWord.toCharArray()) + getInt(secondWord.toCharArray()) == getInt(targetWord.toCharArray());
//   }

//   private int getInt(char[] chars) {
//       int rez = 0;

//       for (char ch : chars) {
//           rez = rez * 10 + (ch - 'a');
//       }

//       return rez;
//   }
// }