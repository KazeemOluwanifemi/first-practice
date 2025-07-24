import java.util.Scanner;

public class first{
    public static void main(String[] args){
//       The reader variable
        Scanner reader = new Scanner(System.in);
//
        divisibleByThreeInRange(1, 10);
    }

    public static void divisibleByThreeInRange(int beginning, int end){
        int i = beginning;
        while(i <= end){
            if(i % 3 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}