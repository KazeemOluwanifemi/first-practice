import java.util.Scanner;
import java.util.ArrayList;


public class first{
//    main method in the call stack
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        ArrayList<String> wordList = new ArrayList<>();
        int i = 0;
        while(true){
            System.out.println("Enter the names of employees: ");
            String name = reader.nextLine();

            if(name.isEmpty()){
                System.out.println("invalid entry");
                break;
            } else {
                 wordList.add(name);
                 i++;
            }
        }

        System.out.println(wordList.get(2));
    }
}