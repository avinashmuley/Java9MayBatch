package exceptionhandling;

public class ExceptionPropagatenDemo {
    void m1(){
       int n1 = 10;
       int n2 =7;
        System.out.println(n1/n2);
    }
    void m2(){
        m1();
    }
    void m3(){
    try {
        m2();
    }catch (ArithmeticException e){
        System.out.println(e.getMessage());
    }
    }
}


class ExceptionPropagateImpl{
    public static void main(String[] args) {
        ExceptionPropagatenDemo demo = new ExceptionPropagatenDemo();
        demo.m3();
    }
}