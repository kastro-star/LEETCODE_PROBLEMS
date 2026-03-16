class Solution {
  public String[] uncommonFromSentences(String s1, String s2) {
      String[] arr1 = s1.split(" ");
      String[] arr2 = s2.split(" ");
      HashMap<String,Integer> kas = new HashMap<>();
      for(int i=0;i<arr1.length;i++){
          if(kas.containsKey(arr1[i])){
             int k = kas.get(arr1[i]);
             k++;
             kas.put(arr1[i],k);
          }
          else{
              kas.put(arr1[i],1);
          }
      }
      for(int i=0;i<arr2.length;i++){
          if(kas.containsKey(arr2[i])){
             int k = kas.get(arr2[i]);
             k++;
             kas.put(arr2[i],k);
          }
          else{
              kas.put(arr2[i],1);
          }
      }
      int y=0;
      String[] fin = new String[200];
      for(String value :kas.keySet()){
         int temp = kas.get(value);
         if(temp == 1){
          fin[y++] = value;
         }
      }
      String[] ans = new String[y];
      for(int u=0;u<y;u++){
          ans[u] = fin[u];
      }
      return ans;
  }
}