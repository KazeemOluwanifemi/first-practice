import java.util.Scanner;

public class first{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        Reading different variable types from users
//        Integer Input
        System.out.println("Enter an integer value: ");
        double value = Double.valueOf(input.nextLine());
        System.out.println("You gave the value " + value);


    }
}