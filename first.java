import java.util.Scanner;

public class first{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        Calculating the user-specified number of days to seconds

        System.out.println("Give the first number: ");
        int firstNumber = Integer.valueOf(input.nextLine());
        System.out.println(firstNumber);

        System.out.println("Give the second number: ");
        int secondNumber = Integer.valueOf(input.nextLine());
        System.out.println(secondNumber);

        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + (firstNumber + secondNumber));
//        System.out.println(firstNumber "+" secondNumber);



    }
}