import java.util.Scanner;

public class first{
    public static void main(String[] args){
//       The reader variable
        Scanner reader = new Scanner(System.in);
//
        printUntilNumber(5);
    }

    public static void printUntilNumber(int number){
//        int i = 1;
        while(number >=1 ){
            System.out.println(number);
            number--;
        }
//        System.out.println("In a hole in the ground, there lived a method.");
    }
}