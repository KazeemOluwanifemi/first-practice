import java.util.Scanner;

public class first{
    public static void main(String[] args){
//       The reader variable
        Scanner reader = new Scanner(System.in);
//        Initialize counter
        int counter = 0;
        int sum = 0;

//        initialize loop
        while(true){
            System.out.println("Enter a number[exit with key 0]: ");
            int number =  reader.nextInt();
            if(number == 0){
                break;
            } else{
                counter = counter + 1;
                sum = sum + number;
            }
        }
        System.out.println("Number of numbers: " + counter);
        System.out.println("Sum of numbers: " + sum);
    }
}