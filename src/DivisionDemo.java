public class DivisionDemo {
    public static void main (String[] args) {
        int n = 20;
        if (n % 3 == 0 && n % 5 == 0 ) {
            System.out.println(n + "is divisible ");

        }
        else if  (n % 3  == 0 ) {
            System.out.println(n+ "is Divisible ");
        }
        else if (n % 5 == 0 ) {
            System.out.println(n + " is Divisible");
        }
    }
}
