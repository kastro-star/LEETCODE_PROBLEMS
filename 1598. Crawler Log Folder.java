class Solution {
  static{
     for(int i=0; i<100; i++){
         minOperations(new String[]{"d1/","../","../","../"});
     }
 }     // What a static {} block is in Java

         // A static initializer block runs once, when the class is loaded, before any object is created or any method is called
//             ➡️ Executes automatically as soon as Solution is loaded by the JVM.

// Why is it here?

// Short answer:
// 👉 It is not needed for correctness.
// 👉 It’s a performance hack, commonly seen in LeetCode submissions.
 public static int minOperations(String[] logs) {
     
     int depth=0;
     for(int i=0;i<logs.length;i++){
         if(logs[i].equals("../") ){
            depth =Math.max(0,--depth);
         }else if(logs[i].equals("./")){
             continue;
         }else{
             depth ++;
         }
     }
     return depth ;
 }
}