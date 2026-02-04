class Solution {
  public String reverseWords(String s) {
      String[] arr = s.split(" ");
      int size = vowelcount(arr[0]);
      for(int i=1;i<arr.length;i++){
          if(vowelcount(arr[i]) == size){
              String reversed = new StringBuilder(arr[i]).reverse().toString();
              arr[i] = reversed;
          }
      }
      String d = String.join(" ",arr);
      return d;
  }
  public int vowelcount(String kas){
      int count=0;
      for(char l:kas.toCharArray()){
          if(l == 'a' || l =='e' || l =='i' || l == 'o' || l== 'u'){
              count++;
          }
      }
      return count;
  }
}