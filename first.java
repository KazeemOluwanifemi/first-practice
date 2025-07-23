import java.util.Scanner;

public class first{
    public static void main(String[] args){
//       The reader variable
        Scanner reader = new Scanner(System.in);
//        Ask users for input any number

        int counter = 0;
        while(true){
            System.out.println("Enter any number: ");
            int input = reader.nextInt();

            if(input < 0 && counter < 5){
                System.out.println("Unsuitable number");
                System.out.println("Try again.");
            } else if(input == 0 && counter < 5){
                System.out.println("Unfit number, try again.");
                continue;
            } else if(input > 0 && counter < 5){
                System.out.println(input * input);
            } else{
                System.out.println("You have exceeded your 5 tries");
                break;
            }
            counter = (counter + 1);
        }
    }
}