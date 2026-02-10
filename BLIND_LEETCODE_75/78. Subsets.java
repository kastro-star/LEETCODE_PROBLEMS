class Solution {
  List<List<Integer>> kas = new ArrayList<>();
  int[] cop;                  // as global for easy acess
  public List<List<Integer>> subsets(int[] nums) {
      cop = nums;                                  // get nums to cop 
      check(new ArrayList<>(),0);        // first call                   (RECURSION WITH BACKTRACKING )
      return kas;
  }
  public void check(List<Integer> sub ,int curindex){
      kas.add(new ArrayList<>(sub));                              // add empty list as first further pass the subset values to the final List 
      for(int i = curindex;i<cop.length;i++){                     // loop occurs in every call  (IF THE I---> VALUE IS BIGGER(STARTING INDEX) LOOP CANNOT EXECUTE)
          sub.add(cop[i]);                                        // add one by one array values to the sub List 
          check(sub,i+1);                                          // recursion occur
          sub.remove(sub.size() -1);                           // affter stop execution of the loop At the current index it stops backtracking starts empty the sub list for next BRANCH
      }
  }
}