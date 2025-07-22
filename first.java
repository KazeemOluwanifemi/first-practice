import java.util.Scanner;

public class first{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        Calculating the user-specified number of days to seconds

        System.out.println("What is your grade [0-100]?");
        int grade = input.nextInt();

        if(grade < 0){
            System.out.println("Impossible!");
        } else if(grade <= 49) {
            System.out.println("failed");
        } else if(grade <= 59) {
            System.out.println("Your point is 1");
        } else if(grade <= 69) {
            System.out.println("Your point is 2");
        } else if(grade <= 79) {
            System.out.println("Your point is 3");
        } else if(grade <= 89) {
            System.out.println("Your point is 4");
        } else if(grade <= 100) {
            System.out.println("Your point is 5");
        } else {
            System.out.println("Incredible");
        }
    }
}