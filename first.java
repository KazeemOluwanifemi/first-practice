public class first{
    public static void main(String[] args){
//       The reader variable
//        Scanner reader = new Scanner(System.in);

        double result = avg(30, 21, 22, 50);
        System.out.println("Average: " + result);

//
    }

    public static int sum(int a, int b, int c, int d){
        return a + b + c + d;
    }

    public static double avg(int a, int b, int c, int d){
        int sum = sum(a,b,c,d);
        return 1.0 * sum / 4;
    }
}