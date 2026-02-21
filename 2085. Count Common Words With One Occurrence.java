class Solution {
  public int countWords(String[] words1, String[] words2) {
      HashMap<String,Integer> kas = new HashMap<>();
      HashMap<String,Integer> jes = new HashMap<>();
      int o=0;
      for(int i=0;i<words1.length;i++){
          int count =1;
          if(kas.containsKey(words1[i])){
              count++;
              kas.put(words1[i],count);
          }else{
              kas.put(words1[i],count);
          }
      }
      for(int k =0;k<words2.length;k++){
          int count=1;
          if(jes.containsKey(words2[k])){
              count++;
              jes.put(words2[k],count);
          }else{
              jes.put(words2[k],count);
          }
      }
      for(int i=0;i<words1.length;i++){
          if(kas.containsKey(words1[i]) && jes.containsKey(words1[i])){
              if(kas.get(words1[i]) == 1 && jes.get(words1[i]) == 1){
                  o++;
              }
          }
      }
      return o;
  }
}