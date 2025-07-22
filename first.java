import java.util.Scanner;

public class first{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        Reading different variable types from users
//        String input
        System.out.println("Please enter your name: ");
        String textMessage = input.nextLine();
        System.out.println(textMessage);

//        String valueAsString = "This";
//        int value = Integer.valueOf(valueAsString); -> doesn't work cause Integer.valueOf can only convert
//                                                       strings that represents valid numbers
//        System.out.println(value);


//        Integer input
        System.out.println("Please enter your age: ");
//        Data type conversion & reading user input
        Integer age = Integer.valueOf(input.nextLine());
        System.out.println(age);


    }
}