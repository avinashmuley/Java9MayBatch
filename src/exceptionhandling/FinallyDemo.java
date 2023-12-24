package exceptionhandling;

import java.sql.SQLOutput;

public class FinallyDemo {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        } finally {
            System.out.println("in Finally Block");
        }
        System.out.println("rest of the code");
    }
}
