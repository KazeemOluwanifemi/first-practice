import java.util.Scanner;

public class first{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        Reading different variable types from users
//        Boolean Input
        System.out.println("Write a true/false question: ");
        String userQuestion = input.nextLine();
        System.out.println("What is your answer, true/false?");

        boolean userAnswer = Boolean.valueOf(input.nextLine());

        System.out.println("Your answer is: " + userAnswer);

    }
}