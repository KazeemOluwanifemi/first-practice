import java.util.Scanner;

public class first{
    public static void main(String[] args){
//       The reader variable
        Scanner reader = new Scanner(System.in);
//
        int sum = 0;
        int counter = 0;
        int even = 0;
        int odd = 0;

        while(true){
            System.out.println("Give a number[enter -1 to stop]: ");
            int number = reader.nextInt();
            sum += number;
            counter++;

            if(number == -1){
                System.out.println("Thx, bye!");
                break;
            }

            if (number % 2 == 0){
                even++;
                continue;
            }

            if(number % 2 != 0){
                odd++;
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counter);
        System.out.println("Average: " + (1.0 * sum/counter));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}