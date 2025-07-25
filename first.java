public class first{


//    main method in the call stack
    public static void main(String[] args){
//        Specify the number of the stars
        printSquare(4);
    }

//    Method to print square
    public static void printSquare(int n){
        for(int i = 0; i < n; i++){
            printLineOfStars(n);
        }
    }

//    Helper method to print a single line of stars
    public static void printLineOfStars(int n){
        for(int i = 0; i < n; i++){
            System.out.print("*");
        }
        System.out.println(" ");
    }

}