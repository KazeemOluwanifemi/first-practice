import java.util.Scanner;

public class first{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        Calculating the user-specified number of days to seconds

        System.out.println("How many days do you want to convert to seconds? ");
        int days = Integer.valueOf(input.nextLine());
        int seconds = days * (24 * 60 * 60);

        System.out.println(days + " days is equal to " + seconds + " seconds.");


    }
}