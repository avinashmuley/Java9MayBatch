import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First no");
        int n1 = sc.nextInt();
        System.out.println("Enter Second no");
        int n2 = sc.nextInt();
        System.out.println("Enter Third no");
        int n3 = sc.nextInt();
        if  (n1 > n2 && n1>n3)
            System.out.println(n1+"is a largest no");
        else
            if (n2 > n1 && n2 > n3)
                System.out.println(n2 + "is a largest no");
            else
                System.out.println(n3 + "is largest no");

    }
}
