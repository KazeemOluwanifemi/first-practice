public class first{


//    main method in the call stack
    public static void main(String[] args){
        multiplicationTable(3);
    }

//    method that forms the rows of the multiplication table
    public static void multiplicationTable(int max){
        int number = 1;

        while(number <= max){
            printMultiplicationTable(number, max);
            number++;
        }
    }

    public static void printMultiplicationTable(int number, int max){
        int printable = number;
        while (printable <= number* max){
            System.out.print(" " + printable);
            printable += number;
        }

        System.out.println(" ");
    }
}