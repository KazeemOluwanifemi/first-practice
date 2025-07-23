import java.util.Scanner;

public class first{
    public static void main(String[] args){
//        user input variable
        Scanner reader = new Scanner(System.in);

//        A program to find the absolute value of a user's integer input
        System.out.println("Please enter a number(positive/negative): ");
        int number = reader.nextInt();

        if(number < 0){
            System.out.println("The absolute value of " + number + " is " + (number * -1));
        } else{
            System.out.println("The number you entered is " + number);
        }
    }
}