public class first{


//    main method in the call stack
    public static void main(String[] args){
//        Specify the number of the stars
        printStars(8);
        printStars(7);
    }

    public static void printStars(int number){
        int i = 0;
        while(i < number){
            System.out.print("*");
            i++;
        }
        System.out.println(" ");
    }

}