package exceptionhandling;

public class MultipeCatchDemo {
    public static void main(String[] args) {
        try {
            String str = "String";
            System.out.println(str.toUpperCase());
            System.out.println(10/2);
            int n = Integer.parseInt(str);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());

        }catch (Exception e){
            System.out.println("Remaining code");
        }
    }
}
