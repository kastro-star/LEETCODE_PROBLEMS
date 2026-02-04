class Solution {
  public String kthDistinct(String[] arr, int k) {
      HashMap<String , Boolean> kas = new HashMap<>();
      for(int i=0;i<arr.length;i++){
          if(kas.containsKey(arr[i])){
              kas.put(arr[i],false);
          }
          else{
              kas.put(arr[i],true);
          }
      }
      int count=0;
      for(String l:arr){
          if(kas.get(l) == true){
              count++;
          }
          if(count == k){
              return l;
          }
      }
      return "";
  }
}