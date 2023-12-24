package Collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> countries =new LinkedHashSet<>();
        countries.add("India");
        countries.add("Australia");
        countries.add("shri-lanka");
        countries.add("England");
        countries.add("Australia") ;
        countries.add("null");
        countries.add(null);

         System.out.println(countries);
    }
}
