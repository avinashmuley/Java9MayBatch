package exceptionhandling;

public class FinallyDemo2 {
    public static void main(String[] args) {
        try{
            String str = "java";
            System.out.println(str.toLowerCase());
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally block");
        }
        System.out.println("rest of the code");
    }
}
