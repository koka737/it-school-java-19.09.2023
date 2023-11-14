package tema11;
import java.util.LinkedList;
public class Clone13 {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        String removedElement = fruits.removeFirst();
        if (removedElement != null) {
            System.out.println("Removed and returned the first element: " + removedElement);
        } else {
            System.out.println("Linked list is empty.");
        }
        System.out.println(fruits);
    }

    }

