package String;

public class StringComparison {
    public static void main(String[] args) {

        String s1 ="pune";
        String s2 = "mumbai";
        String s3 = "pune";
        String s4 = new String("Pune");
        String s5 = "MUMBAI";
        String s6 = "Chennai";

        System.out.println(s1==s3);
        System.out.println(s1==s4);

        System.out.println("s1.equals(s3) "+s1.equals(s3));
        System.out.println("s1.equals(s4) "+s1.equals(s4));


        System.out.println(s2==s5);
        System.out.println("s2.equals(s5) "+s2.equals(s5));
        System.out.println("s2.equalsIgnoreCase(s5) "+s2.equalsIgnoreCase(s5));


        System.out.println("s1.compareTo(s3) "+s1.compareTo(s3));
        System.out.println("s1.compareTo(s2) "+s1.compareTo(s2));
        System.out.println("s1.compareTo(s6) "+s1.compareTo(s6));

    }
}
