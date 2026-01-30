class Solution {
  public List<String> splitWordsBySeparator(List<String> words, char separator) {
      List<String> kas = new ArrayList<>();
      for(String word:words){
          for(String part:word.split("\\" + separator)){
              if(!part.isEmpty()){
                  kas.add(part);
              }
          }
      }
      return kas;
  }
}