import java.util.Scanner;

public class first{
    public static void main(String[] args){
//        user input variable
        Scanner reader = new Scanner(System.in);

//        An introduction to loops
        int i = 0;

        while(true){
            System.out.println(i);
            if(i >= 5){
                break;
            }
            i = i + 1;
        }
    }
}