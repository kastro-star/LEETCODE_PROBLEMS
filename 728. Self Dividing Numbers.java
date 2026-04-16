class Solution {
  public List<Integer> selfDividingNumbers(int left, int right) {
      ArrayList<Integer> kas = new ArrayList<>();
      for(int i=left;i<=right;i++){
          int y=i;
          boolean temp=true;
          while(y!=0){
              int sin = y%10;
              if(sin == 0 ||i % sin != 0 ){
                  temp = false;
              }
              y =y/10;
          }
          if(temp){
              kas.add(i);
          }
      }
      return kas;
  }
}