import java.util.Scanner;

public class first{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        Calculating the user-specified number of days to seconds
        System.out.println("What is the value of the gift? ");
        int gift = input.nextInt();

        if (gift < 5000){
            System.out.println("no tax");
        } else if(gift <= 25000){
            System.out.println("Tax: " + (100 + (gift - 5000) * 0.08));
        } else if(gift <= 55000){
            System.out.println("Tax: " + (1700 + (gift - 25000) * 0.1));
        } else if(gift <= 200000){
            System.out.println("Tax: " + (4700 + (gift - 55000) * 0.12));
        } else if(gift <= 1000000){
            System.out.println("Tax: " + (22100 + (gift - 200000) * 0.15));
        } else if(gift > 1000000){
            System.out.println("Tax: " + (142100 + (gift - 1000000) * 0.17));
        } else {
            System.out.println("Invalid input");
        }
    }
}