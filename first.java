import java.util.Scanner;

public class first{
    public static void main(String[] args){
        Scanner scanner1 = new Scanner(System.in);
        // Scanner scanner2 = new Scanner(System.in);

        // Print out a message
        System.out.println("Chicken: ");
        int chickens = 9000;
        System.out.println(chickens);

        System.out.println("Bacon(kg): ");
        double weight = 0.1;
        System.out.println(weight);

        System.out.println("Tractor: ");
        String tractor = "Zetor";
        System.out.println(tractor);

        System.out.println("And finally, a summary: ");
        System.out.println(chickens + "\n" + weight + "\n" + tractor);
        // System.out.println(weight);
        // System.out.println(tractor);

    }
}