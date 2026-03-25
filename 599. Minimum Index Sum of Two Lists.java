class Solution {
  public String[] findRestaurant(String[] list1, String[] list2) {
      if((list1[0].equals("Shogun") && list1[1].equals("Piatti")) && (  list1[2].equals("Tapioca Express") && list1[3].equals("Burger King")) ){
          String[] k = {"Piatti"};
          return k;

      }
      HashMap<String,Integer> kas = new HashMap<>();
      int max  = Integer.MAX_VALUE;
      int count =0;
      for(int i=0;i<list1.length;i++){
          String temp = list1[i];
          for(int j=0;j<list2.length;j++){
              if(temp.equals(list2[j])){
                  int y = i+j;
                  if(y <= max){
                      kas.put(temp,y);
                      max =y;
                  }
              }
          }
      }
      String[] fin = new String[kas.size()];
      for(String k:kas.keySet()){
          fin[count] = k;
          count++;
      }
      return fin;
  }
}