package tema11;

import java.util.TreeSet;

public class Create23 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<Integer>();
        numbers.add(31);
        numbers.add(12);
        numbers.add(2003);
        numbers.add(11);

        // Creating a reverse order view
        TreeSet<Integer> reverseOrderView = new TreeSet<>(numbers.descendingSet());

        // Displaying the original TreeSet
        System.out.println("Original TreeSet: " + numbers);

        // Displaying the reverse order view
        System.out.println("Reverse Order View: " + reverseOrderView);
    }
}
