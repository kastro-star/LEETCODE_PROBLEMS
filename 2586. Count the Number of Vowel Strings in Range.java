class Solution {
  public static boolean checking(String kas){
      char fir = kas.charAt(0);
      char las = kas.charAt(kas.length() -1);
      if(fir == 'a' || fir == 'e' || fir == 'i' || fir == 'o' || fir == 'u'){
          if(las == 'a'|| las == 'e' || las == 'i' || las == 'o' || las == 'u'){
              return true;
          }
          
      }
      return false;
  }
  public int vowelStrings(String[] words, int left, int right){
      int count = 0;
      for(int i=left;i<=right;i++){
              if(checking(words[i])){
                  count++;
              }
          
      }
     return count;
  }
}