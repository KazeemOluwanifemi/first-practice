import java.util.Scanner;

public class first{
    public static void main(String[] args){
//        user input variable
        Scanner reader = new Scanner(System.in);

//        An introduction to loops
        while(true){
            System.out.println("Give a number: ");
            int answer =  reader.nextInt();

            if(answer == 4){
                break;
            }
            System.out.println("Okay, you inputted: " + answer + " so, let's carry on." );
        }
        System.out.println("Welcome back!");
    }
}