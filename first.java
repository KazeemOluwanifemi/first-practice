import java.util.Scanner;

public class first{
    public static void main(String[] args){
//       The reader variable
        Scanner reader = new Scanner(System.in);
//        Ask user for number of iterations
        System.out.println("How many times?");
        int input = reader.nextInt();
        int i = 1;
        while(i <= input){
            printText();
            i++;
        }

    }

    public static void printText(){
        System.out.println("In a hole in the ground, there lived a method.");
    }
}