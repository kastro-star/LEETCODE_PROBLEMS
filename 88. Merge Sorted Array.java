class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
      PriorityQueue<Integer>min=new PriorityQueue<>();
      for(int i=0;i<m;i++){
          // if(i!=0){
          min.offer(nums1[i]);
      }
      // }
      for(int i=0;i<n;i++){
          // if(i!=0){
          min.offer(nums2[i]);
      }
      // }

        int index = 0;
      while (!min.isEmpty()) {
          nums1[index++] = min.poll();
      }

  
  }
}