public class first{


//    main method in the call stack
    public static void main(String[] args){
//        Specify the number of the stars
        printSquare(17, 3);
    }

//    Method to print square
    public static void printSquare(int breadth, int height){
        for(int i = 0; i < height; i++){
            printLineOfStars(breadth);
        }
    }

//    Helper method to print a single line of stars
    public static void printLineOfStars(int n){
        for(int i = 0; i < n; i++){
            System.out.print("*");
        }
        System.out.println();
    }

}