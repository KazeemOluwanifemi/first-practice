import java.util.Scanner;

public class first{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        Reading different variable types from users
//        Boolean Input
        System.out.println("Give an integer: ");
        int userInteger = Integer.valueOf(input.nextLine());

        System.out.println("Give a string: ");
        String userString = input.nextLine();

        System.out.println("Give a decimal value: ");
        double userDouble = Double.valueOf(input.nextLine());

        System.out.println("Give a boolean value: ");
        boolean userBoolean = Boolean.valueOf(input.nextLine());

        System.out.println("Your integer value is " + userInteger);
        System.out.println("Your string value is " + userString);
        System.out.println("Your decimal value is " + userDouble);
        System.out.println("Your boolean value is " + userBoolean);

    }
}