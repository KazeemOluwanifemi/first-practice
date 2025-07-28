import java.util.Scanner;
import java.util.ArrayList;


public class first{
//    main method in the call stack
    public static void main(String[] args){
//        System.out.println("Name of last user is: " + lastElementOfList());
        methodOfLists();
    }

    public static void methodOfLists(){
        ArrayList<String> list = new ArrayList<>();
        Scanner reader = new Scanner(System.in);

//        User fills up the list
        System.out.println("Who are the members of the club? [Enter an empty space to end loop]");
        String input;
        while (true) {
            input = reader.nextLine();

            if (input.isEmpty()) {
                break; // Exit when empty line is entered
            }

            list.add(input); // Add member to list
        }
//        check if a value exists in the list
        System.out.println("Who are you looking for?");
        input = reader.nextLine();
        if(list.contains(input)){
            System.out.println(input + " is on the list");
        }
    }


}