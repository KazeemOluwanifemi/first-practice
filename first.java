import java.util.Scanner;

public class first{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        Calculating the user-specified number of days to seconds
        System.out.println("Enter a number: ");
        int value = input.nextInt();

        if(value % 2 == 0){
            System.out.println(value + " is an even number");
        } else if(value % 2 == 1){
            System.out.println(value + " is an odd number");
        } else{
            System.out.println("Enter a valid number");
        }
    }
}