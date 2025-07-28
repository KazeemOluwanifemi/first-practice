import java.util.Scanner;
import java.util.ArrayList;


public class first{
//    main method in the call stack
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();

        list.add("Bola");
        list.add("Bolu");
        list.add("Teni");
        list.add("Helen");
        removeLast(list);

        System.out.println(list);
    }

    public static void removeLast(ArrayList<String>list){
        int indexOfLast = list.size() - 1;
        list.remove(indexOfLast);
    }


}