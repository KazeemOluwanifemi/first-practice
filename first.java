import java.util.Scanner;
import java.util.ArrayList;


public class first{
//    main method in the call stack
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        int i = 0;
        while(true){
            System.out.println("Enter a number[Enter key 0 to stop]: ");
            int number = reader.nextInt();

            if(number == 0){
//                System.out.println("invalid entry");
                break;
            } else {
                 numberList.add(number);
                 i++;
            }
        }
        int sum = numberList.get(1) + numberList.get(2);

        System.out.println("The sum of the first and second number is: " + sum );
        System.out.println();
    }
}