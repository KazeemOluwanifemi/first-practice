import java.util.ArrayList;
import java.util.Scanner;


public class first{
//    main method in the call stack
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        String correctUser = "alex";
        String correctUser2 = "emma";
        String correctPassword = "sunshine";
        String correctPassword2 = "haskell";

        while(true){
            System.out.print("Enter username: ");
            String userName = reader.nextLine();
            System.out.print("Enter password: ");
            String passWord = reader.nextLine();
            if(userName.equals(correctUser) && passWord.equals(correctPassword)){
                System.out.print("You have logged in successfully!");
                break;
            } else if(userName.equals(correctUser2) && passWord.equals(correctPassword2)){
                System.out.print("You have logged in successfully!");
                break;
            } else{
                System.out.println("Incorrect username or password");
            }
        }
    }
}