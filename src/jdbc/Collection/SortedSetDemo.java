package Collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<Integer> set= new TreeSet<>();
        set.add(67);
        set.add(86);
        set.add(12);
        set.add(5);
        set.add(90);
        set.add(10);
        set.add(50);
//        set.add(null);
        System.out.println(set);
    }
}
