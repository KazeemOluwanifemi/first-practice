import java.util.ArrayList;
import java.util.Scanner;


public class first{
//    main method in the call stack
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        System.out.println("Give two indices to swap: ");
        int firstNumber = reader.nextInt();
        int secondNumber = reader.nextInt();

        int helper = numbers[firstNumber];
        numbers[firstNumber] = numbers[secondNumber];
        numbers[secondNumber] = helper;

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

    }
}