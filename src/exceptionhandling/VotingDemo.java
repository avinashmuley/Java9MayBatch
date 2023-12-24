package exceptionhandling;

import java.util.Scanner;

public class VotingDemo {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        if (age<=18)
            throw new ArithmeticException("Not Applicable for voting ");

        else

            System.out.println("applicable for vaccine");
    }
}
