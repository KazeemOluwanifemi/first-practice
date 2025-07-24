import java.util.Scanner;

public class first{
    public static void main(String[] args){
//       The reader variable
        Scanner reader = new Scanner(System.in);
//        user input
        System.out.println("Last number of the sequence?");
        int last = reader.nextInt();
        int sum = 0;

        for(int i = 1; i <= last; i++){
            sum = sum + i;
        }
        System.out.println("The sum is " + sum);
    }
}