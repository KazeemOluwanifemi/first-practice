public class first{


//    main method in the call stack
    public static void main(String[] args){
//        Specify the number of the stars
        printStar(4);
    }

//    Method to print star
    public static void printStar(int height){
        for(int i = 1; i <= height; i++){
            printStars(i);
//            height++;
        }
    }

//    Helper method to print a single line of stars
    public static void printStars(int n){
        for(int i = 0; i < n; i++){
            System.out.print("*");
        }
        System.out.println();
    }

}