class Solution {
  public String frequencySort(String s) {
      HashMap<Character,Integer> kas = new HashMap<>();
      for(char k:s.toCharArray()){
          kas.put(k,kas.getOrDefault(k,0)+1);
      }
      PriorityQueue<Character> full = new PriorityQueue<>((a,b) -> kas.get(b) - kas.get(a));
      full.addAll(kas.keySet());
      StringBuilder has = new StringBuilder();
      while(!full.isEmpty()){
          char t = full.poll();
          int temp = kas.get(t);

          while(temp-- >0){
              has.append(t);
          }
      }
      return has.toString();
  }
}