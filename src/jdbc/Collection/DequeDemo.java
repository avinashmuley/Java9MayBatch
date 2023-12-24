package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> numbers =new ArrayDeque<>();
        numbers.add(1);
        numbers.add(2);
        numbers.addLast(3);
        numbers.addFirst(4);
        numbers.removeFirst();
        numbers.removeLast();
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);


        System.out.println(numbers);
    }
}
