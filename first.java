import java.util.Scanner;

public class first{
    public static void main(String[] args){
//        user input variable
        Scanner reader = new Scanner(System.in);

//        A program to calculate the square of a user specified integer
        System.out.println("What number would you like to find the square of?");
        int input1 = reader.nextInt();
        System.out.println("The square of " + input1 + " is " + input1 * input1);

        System.out.println("Enter two random numbers: ");
        int input2 = reader.nextInt();
        int input3 = reader.nextInt();

        int sum = input2 + input3;
        double sqrt = Math.sqrt(sum);
        System.out.println("The square root of the sum of " + input2 + " and " + input3 + " is " + sqrt);
    }
}