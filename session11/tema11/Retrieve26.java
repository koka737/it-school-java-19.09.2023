package tema11;
import java.util.TreeSet;
public class Retrieve26 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<Integer>();
        numbers.add(31);
        numbers.add(12);
        numbers.add(2003);
        numbers.add(5);
        Integer firstElement = numbers.pollFirst();
        if (firstElement != null) {
            System.out.println("Retrieved and removed the first element: " + firstElement);
        } else {
            System.out.println("TreeSet is empty.");
        }

        // Display the updated TreeSet
        System.out.println("Updated TreeSet: " + numbers);
    }
    }

