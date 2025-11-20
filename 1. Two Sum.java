import java.util.Arrays;
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int i,j;
        int n = nums.length;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if((nums[i] + nums[j])==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};

    }

public static void main(String[] args){
    // Scanner Sc =new Scanner(System.in);
    // int target =Sc.nextInt;
    // int n=Sc.nextInt;
    // for()
    int[] arr ={2,7,11,15};
    int target =9;
    
    int[] result = twoSum(arr,target);
    System.out.print(Arrays.toString(result));
}
}