import java.util.Scanner;
import java.util.ArrayList;


public class first{
//    main method in the call stack
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

//        A program to iterate over a list using a for loop
        ArrayList<Integer> list = new ArrayList<>();

        list.add(26);
        list.add(74);
        list.add(32);
        list.add(49);
        list.add(14);

        for(int i = 0; i < list.size(); i++){
            System.out.println(i);
        }

    }


}