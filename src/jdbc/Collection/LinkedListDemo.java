package Collection;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Pineapple");
        fruits.add("Graps");
        System.out.println(fruits);
        fruits.remove(1);
        System.out.println(fruits);


    }
}