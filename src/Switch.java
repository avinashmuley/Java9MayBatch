import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
//        int n = 3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("12");
                break;
            case 2:
                System.out.println("avi");
                break;
            case 3:
                System.out.println("2");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;
            case 7:
                System.out.println("7");
                break;
            default:
                System.out.println("No Chose");
        }
    }
}


