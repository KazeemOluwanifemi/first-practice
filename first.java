import java.util.Scanner;
import java.util.ArrayList;


public class first{
//    main method in the call stack
    public static void main(String[] args){
//        System.out.println("Name of last user is: " + lastElementOfList());
        lastElementOfList();
    }

    public static void lastElementOfList(){
        Scanner reader = new Scanner(System.in);
        ArrayList<String> users = new ArrayList<>();
        System.out.println("Enter each name of the users[enter an empty value to stop loop]: ");
        String name = reader.nextLine();
        users.add(name);

        for(int i = 0; i < users.size(); i++){
            name = reader.nextLine();
            if(name.isEmpty()){
                System.out.println("Loop ends now");
                break;
            } else{
                users.add(name);
            }
        }
        int lastUserIndex = users.size() - 1;
        System.out.println(users.get(lastUserIndex));
//        int indexOfLast = users.size() - 1;
//
//        String lastName = users.get(indexOfLast);
//        System.out.println(lastName);
    }


}