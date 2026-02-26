import java.util.HashMap;
import java.util.Scanner;

public class user_password_storing {
        public static void main(String[] args){
            int id =-1;
            String password = "",yes ="";
            HashMap<Integer,String>  storage = new HashMap<>();
            while(true){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter your userid:");
                id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter your password:");
                password = sc.nextLine();
                if(Checking(password)){
                    System.out.println("Strong password");
                    storage.put(id,password);
                }else{
                    System.out.println("Weak Password");
                }
                System.out.println("See your id and password:");
                System.out.print("Type Yes or No:");
                yes = sc.nextLine();
                int i=-1;
                if(yes.equals("YES") || yes.equals("yes")){
                    System.out.print("Enter your User-id:");
                    i = sc.nextInt();
                    Display(storage,i);
                }
            }
        }
        public static void Display(HashMap<Integer,String> kas,int k){
            for(int i=0;i<kas.size();i++) {
                if (kas.containsKey(k)) {
                    System.out.println("User-id :" + k);
                    System.out.println(kas.get(k));
                    System.out.println("DON'T SHARE YOUR USER-ID AND PASSWORD");
                    break;
                }
            }
        }
        public static boolean Checking(String pass){
            int icount = 0,ccount =0,ucount=0,scount=0;
            for(int i=0;i<pass.length();i++){
                char temp = pass.charAt(i);
                if(Character.isDigit(temp)){
                    icount++;
                }else if(Character.isLetter(temp)){
                    ccount++;
                    if(Character.isUpperCase(temp)){
                        ucount++;
                    }
                }else{
                    scount++;
                }
            }
            if(icount >= 3 && ccount >= 5 && ucount >=1 && scount >=1){
                return true;
            }else{
                return false;
            }
        }

}
