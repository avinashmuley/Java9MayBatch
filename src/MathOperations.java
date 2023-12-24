public class MathOperations {
    public static void main(String[] args){
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        System.out.println("x : " +x);
        System.out.println("y : " +y);
        System.out.println("msg " +args[2]);
        int result = 0;
        result  = x + y ;
        System.out.println("Addition = " + result );
        result = x- y ;
        System.out.println("substraction = " + result);
        result = x * y;
        System.out.println("multiplicatiion =" + result);
        result = x / y;
        System.out.println("Division = " + result );
        result = x % y ;
        System.out.println("mod = " + result);

    }
}
