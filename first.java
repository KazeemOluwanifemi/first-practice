import java.util.ArrayList;


public class first{
//    main method in the call stack
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(34);
        list.add(50);
        list.add(32);
        list.add(23);
        list.add(15);

        System.out.println("The sum of numbers in this list is: " + sum(list));

//        System.out.println(list);
    }

    public static Integer sum(ArrayList<Integer>list){
        int sum = 0;
        for(int i = 0; i < list.size(); i++){
            sum = sum + list.get(i);
        }
        return sum;
    }


}