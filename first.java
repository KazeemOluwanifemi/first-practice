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
        ArrayList<Integer> users = new ArrayList<>();
        System.out.println("Enter random numbers[enter -1 to stop loop]: ");
        int number = reader.nextInt();
        users.add(number);

        for(int i = 0; i < users.size(); i++){
            number = reader.nextInt();
            if(number == -1){
                System.out.println("Loop ends now");

                break;
            } else{
                users.add(number);
            }

        }
        System.out.println("From where?");
        int lower = reader.nextInt();
        System.out.println("To where?");
        int higher = reader.nextInt();

        for(int i = lower; i <= higher; i++){
            System.out.println(users.get(i));
        }
//        for(int i = 0; i <users.size(); i++){
//            System.out.println(users.get(i));
//        }

//        System.out.println(users.get(0,5));
//        int i = 0;
//        while(!users.isEmpty()){
//            if(i < users.size()){
//                i++;
//            } else{
//                break;
//            }
//            System.out.println(users.get(i));
//        }
//        int lastUserIndex = users.size() - 1;
//        System.out.println("The numbers are: " + users);
//        System.out.println("The last name on the list is " + users.get(lastUserIndex));
    }


}