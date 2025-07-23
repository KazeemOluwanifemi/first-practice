import java.util.Scanner;

public class first{
    public static void main(String[] args){
//       The reader variable
        Scanner reader = new Scanner(System.in);
//        Initialize counter
        int counter = 0;

        while(true){
//            Ask for and take user's number
            System.out.println("Enter a number[end the loop with key 0]: ");
            int number = reader.nextInt();
//             Check for the input against conditional statements
            if(number == 0){
                break;
            } else{
                counter = counter + 1;
            }
        }
        System.out.println("Total number of inputted values (excluding zero): " + counter);
    }
}