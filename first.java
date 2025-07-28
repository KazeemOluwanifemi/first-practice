import java.util.ArrayList;
import java.util.Scanner;


public class first{
//    main method in the call stack
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while(true){
            System.out.println("Enter a sentence[give an empy input to end the loop]: ");
            String user = reader.nextLine();

            if(user.isEmpty()){
                break;
            } else{
                String[] pieces = user.split(" ");
                for(int i = 0; i < pieces.length; i++){
                    System.out.println(pieces[i]);
                }
            }
        }
    }
}