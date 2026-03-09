class Solution {
  public String findCommonResponse(List<List<String>> responses) {
      HashMap<String,Integer> kas = new HashMap<>();
      List<String> jes = new ArrayList<>();
      for(int i=0;i<responses.size();i++){
          Set<String> temp = new HashSet<>(responses.get(i));
          for(String h:temp){
              if(kas.containsKey(h)){
                  int y = kas.get(h);
                  y++;
                  kas.put(h,y);
                  
              }else{
                  kas.put(h,1);
                  jes.add(h);
              }
          }
      }
      int max = 0;
      String l = jes.get(0);
      for(int i=0;i<jes.size();i++){
         
           int  u = kas.get(jes.get(i));
             if(u > max || (u == max && jes.get(i).compareTo(l) < 0)){
              max = u;
              l =jes.get(i);
             }
          
      }
      return l;
  }
}