class Solution {
  public boolean check(String s1,String s2){
      int s = s1.length(),k=s2.length();
      if(s > k){
          return false;
      }
      return s2.substring(0,s).equals(s1) && s2.substring(k - s).equals(s1);
  }
  public int countPrefixSuffixPairs(String[] words) {
      int count=0,n=words.length;
      for(int i=0;i<words.length;i++){
          for(int j=i+1;j<words.length;j++){
              if(check(words[i],words[j])){
                  count++;
              }
          }
      }
      return count;
  }
}