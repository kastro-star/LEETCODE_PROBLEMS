class Solution {
  public int minDeletion(String s, int k) {
      int[] freq = new int[26]; 
      int count =0;
      for(int i=0;i<s.length();i++){
          int temp = s.charAt(i) - 'a';
          freq[temp]++;
          if(freq[temp] == 1){
              count++;
          }
      }
      int n = count - k;
      if(count <= k){
          return 0;
      }
      int fin=0,index =-1;
      for(int y =0;y<n;y++){ 
          int small =Integer.MAX_VALUE;
          for(int i=0;i<freq.length;i++){
              if(freq[i] > 0 && freq[i] < small){
                  small = freq[i];
                  index =i;
              }
          }
          fin =fin+small;
          if(index != -1){
              freq[index] = 0;
          }
          freq[index] =0;
          
      }
      return fin;
  }
}