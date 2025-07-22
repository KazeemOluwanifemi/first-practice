import java.util.Scanner;

public class first{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        Calculating the user-specified number of days to seconds
        String password = "Caput Draconis";
        System.out.println("Password: ");
        String trial = input.nextLine();

        if(trial.equals(password)){
            System.out.println("Welcome!");
        } else{
            System.out.println("Off with you!");
        }
    }
}