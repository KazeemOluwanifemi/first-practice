import java.util.ArrayList;
import java.util.Scanner;


public class first{
//    main method in the call stack
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while(true){
            System.out.println("Enter a sentence[give an empty input to end the loop]: ");
            String user = reader.nextLine();

            if(user.isEmpty()){
                break;
            } else{
                String[] pieces = user.split(" ");
                int last = pieces.length -1;
                System.out.println(pieces[last]);
            }
        }
    }
}