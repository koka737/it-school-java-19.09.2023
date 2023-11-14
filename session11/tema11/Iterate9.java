package tema11;
import java.util.LinkedList;
import java.util.ListIterator;

public class Iterate9 {
    public static void main(String[] args) {
        LinkedList<String> sports = new LinkedList<>();
        sports.add("calisthenics");
        sports.add("acro yoga");
        sports.add("gymnastics");
        sports.add("dancing");

        System.out.println("Original linked list: " + sports);

        // Get a ListIterator starting from the end
        ListIterator<String> iterator = sports.listIterator(sports.size());

        // Iterate the linked list in reverse order
        System.out.println("Linked list in reverse order:");
        while (iterator.hasPrevious()) {
            String element = iterator.previous();
            System.out.println(element);
        }
    }
}

