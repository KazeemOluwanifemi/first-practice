import java.util.Scanner;

public class first{
    public static void main(String[] args){
//       The reader variable
        Scanner reader = new Scanner(System.in);
//        user input
        System.out.println("Give a number: ");
        int number = reader.nextInt();
        int product = 1;
//        Loop implementation
        for(int i = 1; i <=number; i++){
            product *= i;
        }
        System.out.println("The factorial of " + number + " is " + product);

    }
}